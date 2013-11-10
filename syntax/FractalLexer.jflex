
/* Specification for ArithExp tokens */

// user customisations
import java_cup.runtime.*;
import java.io.IOException;

// Jlex directives
%%
    
%cup
%public

%class FractalLexer

%type java_cup.runtime.Symbol

%eofval{
	return new Symbol(sym.EOF);
%eofval}

%eofclose false

%char
%column
%line

%{
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
%}


nl = [\n\r]

cc = ([\b\f]|{nl})

ws = {cc}|[\t ]

alpha = [a-zA-Z_"$""#""?""@""~"]

num = [0-9]

alphanum = {alpha}|{num}

%%

// Symbols and operators
<YYINITIAL>	{ws}	{/* ignore whitespace */}
<YYINITIAL>	"+"	{return new Symbol(sym.PLUS);}
<YYINITIAL>	"-"	{return new Symbol(sym.MINUS);}
<YYINITIAL>	"*"	{return new Symbol(sym.MUL);}
<YYINITIAL>	"/"	{return new Symbol(sym.DIV);}
<YYINITIAL>	"%"	{return new Symbol(sym.MOD);}
<YYINITIAL>	"="	{return new Symbol(sym.ASSIGN);}
<YYINITIAL>	"("	{return new Symbol(sym.LPAREN);}
<YYINITIAL>	")"	{return new Symbol(sym.RPAREN);}
<YYINITIAL>	","	{return new Symbol(sym.COMMA);}
<YYINITIAL> "not" {return new Symbol(sym.NOT);}
<YYINITIAL> "and" {return new Symbol(sym.AND);}
<YYINITIAL> "or" {return new Symbol(sym.OR);}
<YYINITIAL> "@" {return new Symbol(sym.COMPOSE);}
<YYINITIAL> "!" {return new Symbol(sym.SEQUENCE);}

// Keywords
<YYINITIAL> "forward" {return new Symbol(sym.FORWARD);}
<YYINITIAL> "back" {return new Symbol(sym.BACK);}
<YYINITIAL> "right" {return new Symbol(sym.RIGHT);}
<YYINITIAL> "home" {return new Symbol(sym.HOME);}
<YYINITIAL> "clear" {return new Symbol(sym.CLEAR);}
<YYINITIAL> "fractal" {return new Symbol(sym.FRACTAL);}
<YYINITIAL> "end" {return new Symbol(sym.END);}
<YYINITIAL> "self" {return new Symbol(sym.SELF);}
<YYINITIAL> "render" {return new Symbol(sym.RENDER);}
<YYINITIAL> "level" {return new Symbol(sym.LEVEL);}
<YYINITIAL> "scale" {return new Symbol(sym.SCALE);}
<YYINITIAL>	"def"	{return new Symbol(sym.DEF);}
<YYINITIAL> "save" {return new Symbol(sym.SAVE);}
<YYINITIAL> "restore" {return new Symbol(sym.RESTORE);}

<YYINITIAL>    [0-9]+ {
	       // INTEGER
	       return new Symbol(sym.INTEGER, 
				 new Integer(yytext()));
	       }

<YYINITIAL>    

<YYINITIAL>    {alpha}{alphanum}* {
	       // VARIABLE
	       return new Symbol(sym.VARIABLE, yytext());
	       }
