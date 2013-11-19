/* The following code was generated by JFlex 1.4.3 on 11/18/13 8:11 PM */

package fractal.syntax;
/* Specification for Fractal tokens */
 
// user customisations
import java_cup.runtime.*;
import java.io.IOException;
 
// Jlex directives

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/18/13 8:11 PM from the specification file
 * <tt>src/fractal/syntax/FractalLexer.jflex</tt>
 */
public class FractalLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\3\1\3\1\1\1\0\1\3\1\2\22\0\1\3\2\0"+
    "\2\4\1\12\2\0\1\24\1\25\1\11\1\7\1\26\1\10\1\50"+
    "\1\6\12\5\2\0\1\14\1\13\1\15\34\4\1\44\1\0\1\45"+
    "\1\0\1\4\1\0\1\16\1\31\1\32\1\20\1\35\1\27\1\37"+
    "\1\40\1\36\1\4\1\33\1\34\1\43\1\17\1\21\1\41\1\4"+
    "\1\22\1\47\1\23\1\42\1\46\1\30\3\4\3\0\1\4\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\5\2\1\14\1\15\1\16"+
    "\7\2\1\17\1\20\1\2\2\0\3\2\1\21\1\22"+
    "\2\2\1\23\3\2\1\24\1\2\1\25\3\2\1\26"+
    "\1\2\1\27\3\2\1\30\2\31\1\32\1\33\1\34"+
    "\11\2\1\35\14\2\1\36\2\2\1\37\1\2\1\40"+
    "\4\2\1\41\1\42\1\2\1\43\1\44\4\2\1\45"+
    "\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[105];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\51\0\122\0\173\0\244\0\315\0\51\0\51"+
    "\0\51\0\51\0\51\0\51\0\51\0\366\0\u011f\0\u0148"+
    "\0\u0171\0\u019a\0\51\0\51\0\51\0\u01c3\0\u01ec\0\u0215"+
    "\0\u023e\0\u0267\0\u0290\0\u02b9\0\51\0\51\0\u02e2\0\u030b"+
    "\0\u0334\0\u035d\0\u0386\0\u03af\0\173\0\173\0\u03d8\0\u0401"+
    "\0\173\0\u042a\0\u0453\0\u047c\0\173\0\u04a5\0\173\0\u04ce"+
    "\0\u04f7\0\u0520\0\173\0\u0549\0\173\0\u0572\0\u059b\0\u05c4"+
    "\0\u030b\0\51\0\u05ed\0\173\0\173\0\173\0\u0616\0\u063f"+
    "\0\u0668\0\u0691\0\u06ba\0\u06e3\0\u070c\0\u0735\0\u075e\0\173"+
    "\0\u0787\0\u07b0\0\u07d9\0\u0802\0\u082b\0\u0854\0\u087d\0\u08a6"+
    "\0\u08cf\0\u08f8\0\u0921\0\u094a\0\173\0\u0973\0\u099c\0\173"+
    "\0\u09c5\0\173\0\u09ee\0\u0a17\0\u0a40\0\u0a69\0\173\0\173"+
    "\0\u0a92\0\173\0\173\0\u0abb\0\u0ae4\0\u0b0d\0\u0b36\0\173"+
    "\0\173";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[105];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\2\1\3\1\2\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\4\1\23\1\24\1\25\1\26"+
    "\1\4\1\27\1\30\1\4\1\31\1\32\2\4\1\33"+
    "\1\34\2\4\1\35\1\36\1\4\1\37\1\40\52\0"+
    "\1\2\53\0\2\4\10\0\6\4\3\0\15\4\2\0"+
    "\2\4\6\0\1\5\42\0\1\40\6\0\1\41\46\0"+
    "\2\4\10\0\1\4\1\42\4\4\3\0\15\4\2\0"+
    "\2\4\5\0\2\4\10\0\3\4\1\43\2\4\3\0"+
    "\15\4\2\0\2\4\5\0\2\4\10\0\6\4\3\0"+
    "\6\4\1\44\6\4\2\0\2\4\5\0\2\4\10\0"+
    "\4\4\1\45\1\4\3\0\15\4\2\0\2\4\5\0"+
    "\2\4\10\0\5\4\1\46\3\0\6\4\1\47\1\50"+
    "\5\4\2\0\2\4\5\0\2\4\10\0\2\4\1\51"+
    "\1\52\1\53\1\4\3\0\15\4\2\0\2\4\5\0"+
    "\2\4\10\0\1\54\5\4\3\0\4\4\1\55\10\4"+
    "\2\0\2\4\5\0\2\4\10\0\6\4\3\0\5\4"+
    "\1\56\7\4\2\0\2\4\5\0\2\4\10\0\5\4"+
    "\1\57\3\0\6\4\1\60\6\4\2\0\2\4\5\0"+
    "\2\4\10\0\1\4\1\61\4\4\3\0\15\4\2\0"+
    "\2\4\5\0\2\4\10\0\3\4\1\62\2\4\3\0"+
    "\15\4\2\0\2\4\5\0\2\4\10\0\2\4\1\63"+
    "\3\4\3\0\6\4\1\64\4\4\1\65\1\4\2\0"+
    "\2\4\5\0\2\4\10\0\1\66\5\4\3\0\3\4"+
    "\1\67\2\4\1\70\6\4\2\0\2\4\6\0\1\71"+
    "\43\0\1\41\1\72\1\73\46\41\4\0\2\4\10\0"+
    "\2\4\1\74\3\4\3\0\15\4\2\0\2\4\5\0"+
    "\2\4\10\0\5\4\1\75\3\0\15\4\2\0\2\4"+
    "\5\0\2\4\10\0\6\4\3\0\1\76\14\4\2\0"+
    "\2\4\5\0\2\4\10\0\1\4\1\77\4\4\3\0"+
    "\15\4\2\0\1\4\1\100\5\0\2\4\10\0\6\4"+
    "\3\0\10\4\1\101\4\4\2\0\2\4\5\0\2\4"+
    "\10\0\4\4\1\102\1\4\3\0\15\4\2\0\2\4"+
    "\5\0\2\4\10\0\1\103\5\4\3\0\15\4\2\0"+
    "\2\4\5\0\2\4\10\0\6\4\3\0\3\4\1\104"+
    "\11\4\2\0\2\4\5\0\2\4\10\0\6\4\3\0"+
    "\6\4\1\105\6\4\2\0\2\4\5\0\2\4\10\0"+
    "\6\4\3\0\1\106\14\4\2\0\1\107\1\4\5\0"+
    "\2\4\10\0\2\4\1\110\3\4\3\0\15\4\2\0"+
    "\2\4\5\0\2\4\10\0\6\4\3\0\14\4\1\111"+
    "\2\0\2\4\5\0\2\4\10\0\1\4\1\112\4\4"+
    "\3\0\15\4\2\0\2\4\5\0\2\4\10\0\6\4"+
    "\3\0\15\4\2\0\1\113\1\4\5\0\2\4\10\0"+
    "\1\114\5\4\3\0\15\4\2\0\2\4\5\0\2\4"+
    "\10\0\6\4\3\0\5\4\1\115\7\4\2\0\2\4"+
    "\2\0\1\72\53\0\2\4\10\0\2\4\1\116\3\4"+
    "\3\0\15\4\2\0\2\4\5\0\2\4\10\0\5\4"+
    "\1\117\3\0\15\4\2\0\2\4\5\0\2\4\10\0"+
    "\6\4\3\0\11\4\1\120\3\4\2\0\2\4\5\0"+
    "\2\4\10\0\6\4\3\0\1\4\1\121\13\4\2\0"+
    "\2\4\5\0\2\4\10\0\6\4\3\0\3\4\1\122"+
    "\11\4\2\0\2\4\5\0\2\4\10\0\6\4\3\0"+
    "\4\4\1\55\10\4\2\0\2\4\5\0\2\4\10\0"+
    "\1\123\5\4\3\0\15\4\2\0\2\4\5\0\2\4"+
    "\10\0\5\4\1\57\3\0\15\4\2\0\2\4\5\0"+
    "\2\4\10\0\6\4\3\0\6\4\1\124\6\4\2\0"+
    "\2\4\5\0\2\4\10\0\6\4\3\0\6\4\1\125"+
    "\6\4\2\0\2\4\5\0\2\4\10\0\2\4\1\126"+
    "\3\4\3\0\13\4\1\127\1\4\2\0\2\4\5\0"+
    "\2\4\10\0\6\4\3\0\6\4\1\130\6\4\2\0"+
    "\2\4\5\0\2\4\10\0\6\4\3\0\5\4\1\131"+
    "\7\4\2\0\2\4\5\0\2\4\10\0\6\4\3\0"+
    "\1\132\14\4\2\0\2\4\5\0\2\4\10\0\6\4"+
    "\3\0\6\4\1\133\6\4\2\0\2\4\5\0\2\4"+
    "\10\0\3\4\1\134\2\4\3\0\15\4\2\0\2\4"+
    "\5\0\2\4\10\0\5\4\1\46\3\0\15\4\2\0"+
    "\2\4\5\0\2\4\10\0\1\135\5\4\3\0\15\4"+
    "\2\0\2\4\5\0\2\4\10\0\5\4\1\136\3\0"+
    "\15\4\2\0\2\4\5\0\2\4\10\0\4\4\1\137"+
    "\1\4\3\0\15\4\2\0\2\4\5\0\2\4\10\0"+
    "\6\4\3\0\5\4\1\140\7\4\2\0\2\4\5\0"+
    "\2\4\10\0\3\4\1\141\2\4\3\0\15\4\2\0"+
    "\2\4\5\0\2\4\10\0\6\4\3\0\12\4\1\65"+
    "\2\4\2\0\2\4\5\0\2\4\10\0\6\4\3\0"+
    "\6\4\1\142\6\4\2\0\2\4\5\0\2\4\10\0"+
    "\4\4\1\143\1\4\3\0\15\4\2\0\2\4\5\0"+
    "\2\4\10\0\4\4\1\144\1\4\3\0\15\4\2\0"+
    "\2\4\5\0\2\4\10\0\4\4\1\145\1\4\3\0"+
    "\15\4\2\0\2\4\5\0\2\4\10\0\1\146\5\4"+
    "\3\0\15\4\2\0\2\4\5\0\2\4\10\0\6\4"+
    "\3\0\1\4\1\147\13\4\2\0\2\4\5\0\2\4"+
    "\10\0\6\4\3\0\6\4\1\150\6\4\2\0\2\4"+
    "\5\0\2\4\10\0\2\4\1\51\3\4\3\0\15\4"+
    "\2\0\2\4\5\0\2\4\10\0\6\4\3\0\5\4"+
    "\1\151\7\4\2\0\2\4\5\0\2\4\10\0\1\4"+
    "\1\63\4\4\3\0\15\4\2\0\2\4\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2911];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\7\11\5\1\3\11\7\1\2\11"+
    "\1\1\2\0\30\1\1\11\57\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[105];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public int getChar() {
  return yychar + 1;
    }
 
    public int getColumn() {
      return yycolumn + 1;
    }
 
    public int getLine() {
  return yyline + 1;
    }
 
    public String getText() {
  return yytext();
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public FractalLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public FractalLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 120) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { /* ignore whitespace */
          }
        case 39: break;
        case 8: 
          { return new Symbol(sym.MOD);
          }
        case 40: break;
        case 22: 
          { return new Symbol(sym.PENDOWN);
          }
        case 41: break;
        case 28: 
          { return new Symbol(sym.DEF);
          }
        case 42: break;
        case 38: 
          { return new Symbol(sym.FRACTAL);
          }
        case 43: break;
        case 17: 
          { return new Symbol(sym.OR);
          }
        case 44: break;
        case 9: 
          { return new Symbol(sym.EQ);
          }
        case 45: break;
        case 33: 
          { return new Symbol(sym.CLEAR);
          }
        case 46: break;
        case 37: 
          { return new Symbol(sym.RESTORE);
          }
        case 47: break;
        case 3: 
          { // INTEGER
         return new Symbol(sym.INTEGER, 
         new Integer(yytext()));
          }
        case 48: break;
        case 13: 
          { return new Symbol(sym.RPAREN);
          }
        case 49: break;
        case 34: 
          { return new Symbol(sym.LEVEL);
          }
        case 50: break;
        case 6: 
          { return new Symbol(sym.MINUS);
          }
        case 51: break;
        case 5: 
          { return new Symbol(sym.PLUS);
          }
        case 52: break;
        case 36: 
          { return new Symbol(sym.RENDER);
          }
        case 53: break;
        case 19: 
          { return new Symbol(sym.FORWARD);
          }
        case 54: break;
        case 15: 
          { return new Symbol(sym.LBRACE);
          }
        case 55: break;
        case 25: 
          { /* ignore comments */
          }
        case 56: break;
        case 14: 
          { return new Symbol(sym.COMMA);
          }
        case 57: break;
        case 7: 
          { return new Symbol(sym.MUL);
          }
        case 58: break;
        case 32: 
          { return new Symbol(sym.SELF);
          }
        case 59: break;
        case 20: 
          { return new Symbol(sym.BACK);
          }
        case 60: break;
        case 23: 
          { return new Symbol(sym.PENUP);
          }
        case 61: break;
        case 11: 
          { return new Symbol(sym.GT);
          }
        case 62: break;
        case 30: 
          { return new Symbol(sym.HOME);
          }
        case 63: break;
        case 10: 
          { return new Symbol(sym.LT);
          }
        case 64: break;
        case 35: 
          { return new Symbol(sym.SCALE);
          }
        case 65: break;
        case 24: 
          { // REAL
         return new Symbol(sym.REAL, 
         new Double(yytext()));
          }
        case 66: break;
        case 29: 
          { return new Symbol(sym.END);
          }
        case 67: break;
        case 18: 
          { return new Symbol(sym.RIGHT);
          }
        case 68: break;
        case 12: 
          { return new Symbol(sym.LPAREN);
          }
        case 69: break;
        case 21: 
          { return new Symbol(sym.LEFT);
          }
        case 70: break;
        case 27: 
          { return new Symbol(sym.NOT);
          }
        case 71: break;
        case 26: 
          { return new Symbol(sym.AND);
          }
        case 72: break;
        case 31: 
          { return new Symbol(sym.SAVE);
          }
        case 73: break;
        case 16: 
          { return new Symbol(sym.RBRACE);
          }
        case 74: break;
        case 4: 
          { return new Symbol(sym.DIV);
          }
        case 75: break;
        case 2: 
          { // VARIABLE
         return new Symbol(sym.VARIABLE, yytext());
          }
        case 76: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
              {   return new Symbol(sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
