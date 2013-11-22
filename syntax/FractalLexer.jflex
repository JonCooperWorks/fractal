package fractal.syntax;
/* Specification for Fractal tokens */
 
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
 
 nl = [\n\r]|\r\n
 
cc = ([\b\f]|{nl})
 
ws = {cc}|[\t ]
 
alpha = [a-zA-Z_"$""#""?""@""~"]

num = [0-9]
 
alphanum = {alpha}|{num}
 
validComment = [^\r\n]
 
%%
 
<YYINITIAL> {ws}  {/* ignore whitespace */}
<YYINITIAL> "//"{validComment}* {nl} { /* ignore comments */ }
<YYINITIAL> "+" {return new Symbol(sym.PLUS);}
<YYINITIAL> "-" {return new Symbol(sym.MINUS);}
<YYINITIAL> "*" {return new Symbol(sym.MUL);}
<YYINITIAL> "/" {return new Symbol(sym.DIV);}
<YYINITIAL> "%" {return new Symbol(sym.MOD);}
<YYINITIAL> "=" {return new Symbol(sym.EQ);}
 
<YYINITIAL> "<" {return new Symbol(sym.LT);}
<YYINITIAL> ">" {return new Symbol(sym.GT);}
<YYINITIAL> "and" {return new Symbol(sym.AND);}
<YYINITIAL> "or"  {return new Symbol(sym.OR);}
<YYINITIAL> "not" {return new Symbol(sym.NOT);}
 
<YYINITIAL> "(" {return new Symbol(sym.LPAREN);}
<YYINITIAL> ")" {return new Symbol(sym.RPAREN);}
 
<YYINITIAL> "," {return new Symbol(sym.COMMA);}
 
<YYINITIAL> "forward"|"fd"  {return new Symbol(sym.FORWARD);}
<YYINITIAL> "back"|"bk"   {return new Symbol(sym.BACK);}
<YYINITIAL> "left"|"lt"   {return new Symbol(sym.LEFT);}
<YYINITIAL> "right"|"rt"    {return new Symbol(sym.RIGHT);}
<YYINITIAL> "penup"|"pu"    {return new Symbol(sym.PENUP);}
<YYINITIAL> "pendown"|"pd"  {return new Symbol(sym.PENDOWN);}
<YYINITIAL> "home"    {return new Symbol(sym.HOME);}
<YYINITIAL> "clear"   {return new Symbol(sym.CLEAR);}
 
<YYINITIAL> "render"  {return new Symbol(sym.RENDER);}
<YYINITIAL> "["   {return new Symbol(sym.LBRACE);}
<YYINITIAL> "]"   {return new Symbol(sym.RBRACE);}
<YYINITIAL> "level"   {return new Symbol(sym.LEVEL);}
<YYINITIAL> "scale"   {return new Symbol(sym.SCALE);}
<YYINITIAL> "save"    {return new Symbol(sym.SAVE);}
<YYINITIAL> "restore" {return new Symbol(sym.RESTORE);}
<YYINITIAL> "def"   {return new Symbol(sym.DEF);}
<YYINITIAL> "self"    {return new Symbol(sym.SELF);}
<YYINITIAL> "fractal" {return new Symbol(sym.FRACTAL);}
<YYINITIAL> "end"   {return new Symbol(sym.END);}
 
<YYINITIAL>    {num}+ {
         // INTEGER
         return new Symbol(sym.INTEGER, 
         new Integer(yytext()));
         }
 
<YYINITIAL>    {alpha}({alphanum})* {
         // VARIABLE
         return new Symbol(sym.VARIABLE, yytext());
         }
 
<YYINITIAL>   {num}*\.{num}+ {
         // REAL
         return new Symbol(sym.REAL, 
         new Double(yytext()));
         }
