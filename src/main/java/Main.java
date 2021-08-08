import parse.ParseException;
import parse.Parser;

public class Main {
    public static void main(String[] args) throws Exception {
        Parser p = new Parser();
        p.parse("SELECT a.b FROM asfda WHERE 1 = 2");
    }
}