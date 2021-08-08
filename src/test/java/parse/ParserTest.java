package parse;

import io.questdb.griffin.model.ExpressionNode;
import org.junit.Assert;
import org.junit.Test;

public class ParserTest {
    private final static RpnBuilder rpnBuilder = new RpnBuilder();

    @Test
    public void testSimple() throws Exception {
        Parser p = new Parser();
        p.parse("SELECT a.b FROM a WHERE b = 1");
        Assert.assertEquals("SELECT(a.b) FROM(a) WHERE(b=1)", serialize(p));
    }

    @Test
    public void testCaseInSelect() throws Exception {
        Parser p = new Parser();
        p.parse("SELECT " +
                "CASE " +
                "WHEN a = 1 THEN 1 " +
                "WHEN b = 2 THEN 3 " +
                "ELSE 2 " +
                "END Col " +
                "FROM a " +
                "WHERE b = 1");
        Assert.assertEquals("SELECT(CASE(2,3,b=2,1,a=1),Col) FROM(a) WHERE(b=1)", serialize(p));
    }

    @Test
    public void testCaseInWhere() throws Exception {
        Parser p = new Parser();
        p.parse("SELECT a.b\n" +
                "FROM a\n" +
                "WHERE b = 1\n" +
                "AND CASE a\n" +
                "WHEN 1 THEN 1\n" +
                "WHEN 2 THEN 3\n" +
                //"ELSE 2\n" +
                "END = c"
        );
        Assert.assertEquals("SELECT(a.b) FROM(a) WHERE(AND(b=1,CASE(3,2,1,1,a)=c))", serialize(p));
    }

    @Test
    public void testCastSimple() throws Exception {
        Parser p = new Parser();
        p.parse("SELECT CAST(a.b AS FLOAT), b, c\n" +
                "FROM a\n"
        );
        Assert.assertEquals("SELECT(c,b,CAST(a.b,FLOAT)) FROM(a) ", serialize(p));
    }

    private String serialize(Parser p) {
        StringBuilder sb = new StringBuilder();
        traverse(p.selectNode, sb);
        sb.append(" ");
        traverse(p.fromNode, sb);
        sb.append(" ");
        traverse(p.whereNode, sb);
        return sb.toString();
    }

    public void traverse(ExpressionNode node, StringBuilder sb) {
        if (node == null) return;

        boolean isOperation = node.type == ExpressionNode.OPERATION;
        if (!isOperation) {
            sb.append(node.token);
        }
        boolean hasNested = node.rhs != null || node.lhs != null || node.args.size() > 0;
        if (hasNested) {
            if (!isOperation) {
                sb.append("(");
            }
            traverse(node.lhs, sb);
            if (isOperation) {
                sb.append(node.token);
            } else if (node.lhs != null) {
                sb.append(",");
            }

            traverse(node.rhs, sb);
            if (node.args != null) {
                for (int i = 0; i < node.args.size(); i++) {
                    traverse(node.args.get(i), sb);
                    if (i < node.args.size() - 1) {
                        sb.append(",");
                    }
                }
            }
            if (!isOperation) {
                sb.append(")");
            }
        }

    }
}
