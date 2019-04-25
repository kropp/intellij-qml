package name.kropp.intellij.qml;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import name.kropp.intellij.qml.psi.QmlTypes;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static name.kropp.intellij.qml.psi.QmlTypes.*;

%%

%{
  public _QmlLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _QmlLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

END_OF_LINE_COMMENT="//"[^\n]*
BLOCK_COMMENT="/*" ( ([^"*"]|[\r\n])* ("*"+ [^"*""/"] )? )* ("*" | "*"+"/")?
NEWLINE=[\n]+
WHITESPACE=[ \t]+
STRING="\""[^\"]*"\""
SQ_STRING="\'"[^\']*"\'"

%state IMPORT PROPERTYVALUE

%%

<PROPERTYVALUE> {
  [a-zA-Z0-9\t\.\+\/\*\&\!\?\:\=\-\>\<]+   { return VALUE; }
}

{END_OF_LINE_COMMENT}  { return LINE_COMMENT; }
{BLOCK_COMMENT}        { return BLOCK_COMMENT; }
{WHITESPACE}           { return WHITE_SPACE; }
{NEWLINE}              { yybegin(YYINITIAL); return WHITE_SPACE; }
"import"               { return KEYWORD_IMPORT; }
"alias"                { return KEYWORD_ALIAS; }
"as"                   { return KEYWORD_AS; }
"true"                 { return TRUE; }
"false"                { return FALSE; }
"default"              { return KEYWORD_DEFAULT; }
"property"             { return KEYWORD_PROPERTY; }
"var"                  { return KEYWORD_VAR; }
"readonly"             { return KEYWORD_READONLY; }
"signal"               { return KEYWORD_SIGNAL; }
"function"             { return KEYWORD_FUNCTION; }
"double"               { return KEYWORD_DOUBLE; }
"real"                 { return KEYWORD_REAL; }
"pragma"               { return KEYWORD_PRAGMA; }
"Singleton"            { return KEYWORD_SINGLETON; }
"\{"                   { return LBRACE; }
"\}"                   { return RBRACE; }
"\["                   { return LBRACKET; }
"\]"                   { return RBRACKET; }
"\("                   { return LPAREN; }
"\)"                   { return RPAREN; }
":"                    { yybegin(PROPERTYVALUE); return COLON; }
";"                    { return SEMICOLON; }
","                    { return COMMA; }
[0-9]+"."[0-9]+        { return FLOAT; }
[0-9]+                 { return INTEGER; }
[a-zA-Z0-9\.]+         { return IDENTIFIER; }
{STRING}               { return STRING; }
{SQ_STRING}            { return STRING; }
[a-zA-Z0-9\.\+\/\*\&\!\=\-\>\<]+   { return VALUE; }


[^] { return BAD_CHARACTER; }