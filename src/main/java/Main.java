import parse.ParseException;
import parse.Parser;

public class Main {
    public static void main(String[] args) throws ParseException {
        Parser p = new Parser(new java.io.StringReader("SELECT a.b FROM asfda a where 1 = 2"));
        System.out.println(p.Query());
    }
}