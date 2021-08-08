/* Generated by: ParserGeneratorCC: Do not edit this line. ParserConstants.java */
package parse;


/**
 * Token literal values and constants.
 * Generated by com.helger.pgcc.output.java.OtherFilesGenJava#start()
 */
public interface ParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int K_ALL = 5;
  /** RegularExpression Id. */
  int K_ALTER = 6;
  /** RegularExpression Id. */
  int K_AND = 7;
  /** RegularExpression Id. */
  int K_ANY = 8;
  /** RegularExpression Id. */
  int K_AS = 9;
  /** RegularExpression Id. */
  int K_ASC = 10;
  /** RegularExpression Id. */
  int K_BEGIN = 11;
  /** RegularExpression Id. */
  int K_BETWEEN = 12;
  /** RegularExpression Id. */
  int K_BOOLEAN = 13;
  /** RegularExpression Id. */
  int K_BY = 14;
  /** RegularExpression Id. */
  int K_CACHE = 15;
  /** RegularExpression Id. */
  int K_CASE = 16;
  /** RegularExpression Id. */
  int K_CAST = 17;
  /** RegularExpression Id. */
  int K_CHAR = 18;
  /** RegularExpression Id. */
  int K_CAPACITY = 19;
  /** RegularExpression Id. */
  int K_DATE = 20;
  /** RegularExpression Id. */
  int K_DESC = 21;
  /** RegularExpression Id. */
  int K_DISTINCT = 22;
  /** RegularExpression Id. */
  int K_DOUBLE = 23;
  /** RegularExpression Id. */
  int K_ELSE = 24;
  /** RegularExpression Id. */
  int K_END = 25;
  /** RegularExpression Id. */
  int K_FLOAT = 26;
  /** RegularExpression Id. */
  int K_FROM = 27;
  /** RegularExpression Id. */
  int K_FULL = 28;
  /** RegularExpression Id. */
  int K_IN = 29;
  /** RegularExpression Id. */
  int K_INDEX = 30;
  /** RegularExpression Id. */
  int K_INNER = 31;
  /** RegularExpression Id. */
  int K_INTEGER = 32;
  /** RegularExpression Id. */
  int K_INTO = 33;
  /** RegularExpression Id. */
  int K_IS = 34;
  /** RegularExpression Id. */
  int K_LEFT = 35;
  /** RegularExpression Id. */
  int K_LIKE = 36;
  /** RegularExpression Id. */
  int K_NOCACHE = 37;
  /** RegularExpression Id. */
  int K_NOT = 38;
  /** RegularExpression Id. */
  int K_NULL = 39;
  /** RegularExpression Id. */
  int K_OR = 40;
  /** RegularExpression Id. */
  int K_ORDER = 41;
  /** RegularExpression Id. */
  int K_PARTITION = 42;
  /** RegularExpression Id. */
  int K_SAMPLE = 43;
  /** RegularExpression Id. */
  int K_SELECT = 44;
  /** RegularExpression Id. */
  int K_SET = 45;
  /** RegularExpression Id. */
  int K_TABLE = 46;
  /** RegularExpression Id. */
  int K_THEN = 47;
  /** RegularExpression Id. */
  int K_UNION = 48;
  /** RegularExpression Id. */
  int K_VALUES = 49;
  /** RegularExpression Id. */
  int K_STRING = 50;
  /** RegularExpression Id. */
  int K_WHERE = 51;
  /** RegularExpression Id. */
  int K_WHEN = 52;
  /** RegularExpression Id. */
  int K_WITH = 53;
  /** RegularExpression Id. */
  int S_NUMBER = 54;
  /** RegularExpression Id. */
  int FLOAT = 55;
  /** RegularExpression Id. */
  int INTEGER = 56;
  /** RegularExpression Id. */
  int DIGIT = 57;
  /** RegularExpression Id. */
  int LINE_COMMENT = 58;
  /** RegularExpression Id. */
  int MULTI_LINE_COMMENT = 59;
  /** RegularExpression Id. */
  int S_IDENTIFIER = 60;
  /** RegularExpression Id. */
  int LETTER = 61;
  /** RegularExpression Id. */
  int SPECIAL_CHARS = 62;
  /** RegularExpression Id. */
  int S_BIND = 63;
  /** RegularExpression Id. */
  int S_CHAR_LITERAL = 64;
  /** RegularExpression Id. */
  int S_QUOTED_IDENTIFIER = 65;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\r\"",
    "\"\\n\"",
    "\"ALL\"",
    "\"ALTER\"",
    "\"AND\"",
    "\"ANY\"",
    "\"AS\"",
    "\"ASC\"",
    "\"BEGIN\"",
    "\"BETWEEN\"",
    "\"BOOLEAN\"",
    "\"BY\"",
    "\"CACHE\"",
    "\"CASE\"",
    "\"CAST\"",
    "\"CHAR\"",
    "\"CAPACITY\"",
    "\"DATE\"",
    "\"DESC\"",
    "\"DISTINCT\"",
    "\"DOUBLE\"",
    "\"ELSE\"",
    "\"END\"",
    "\"FLOAT\"",
    "\"FROM\"",
    "\"FULL\"",
    "\"IN\"",
    "\"INDEX\"",
    "\"INNER\"",
    "\"INTEGER\"",
    "\"INTO\"",
    "\"IS\"",
    "\"LEFT\"",
    "\"LIKE\"",
    "\"NOCACHE\"",
    "\"NOT\"",
    "\"NULL\"",
    "\"OR\"",
    "\"ORDER\"",
    "\"PARTITION\"",
    "\"SAMPLE\"",
    "\"SELECT\"",
    "\"SET\"",
    "\"TABLE\"",
    "\"THEN\"",
    "\"UNION\"",
    "\"VALUES\"",
    "\"STRING\"",
    "\"WHERE\"",
    "\"WHEN\"",
    "\"WITH\"",
    "<S_NUMBER>",
    "<FLOAT>",
    "<INTEGER>",
    "<DIGIT>",
    "<LINE_COMMENT>",
    "<MULTI_LINE_COMMENT>",
    "<S_IDENTIFIER>",
    "<LETTER>",
    "<SPECIAL_CHARS>",
    "<S_BIND>",
    "<S_CHAR_LITERAL>",
    "<S_QUOTED_IDENTIFIER>",
    "\"$\"",
    "\"BYTE\"",
    "\"SHORT\"",
    "\"INT\"",
    "\"SYMBOL\"",
    "\"LONG\"",
    "\"TIMESTAMP\"",
    "\"BINARY\"",
    "\"LONG256\"",
    "\"INSERT\"",
    "\"(\"",
    "\",\"",
    "\")\"",
    "\";\"",
    "\"+\"",
    "\"-\"",
    "\"||\"",
    "\"*\"",
    "\"/\"",
    "\".\"",
    "\"=\"",
    "\"!\"",
    "\"#\"",
    "\">\"",
    "\"<\"",
    "\"OUT\"",
    "\":=\"",
    "\"DEFAULT\"",
    "\"=>\"",
    "\"INTERSECT\"",
    "\"MINUS\"",
    "\"UNIQUE\"",
    "\".*\"",
    "\"RETURNING\"",
    "\"OVER\"",
    "\"ROWS\"",
    "\"RANGE\"",
    "\"CURRENT\"",
    "\"ROW\"",
    "\"ONLY\"",
    "\"PX_GRANULE\"",
    "\"ON\"",
    "\"RIGHT\"",
    "\"NULLS\"",
    "\"EXISTS\"",
    "\"TO\"",
  };

}