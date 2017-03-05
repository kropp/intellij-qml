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

COMMENT="//"[^\n]*
WHITESPACE=[ \t\n]+
STRING="\""[^\"]*"\""

%state IMPORT

%%

{COMMENT}              { return COMMENT; }
{WHITESPACE}           { return WHITE_SPACE; }
"import"               { yybegin(IMPORT); return KEYWORD_IMPORT; }
"\{"                   { return LBRACE; }
"\}"                   { return RBRACE; }
":"                    { return COLON; }
[a-zA-Z0-9\.]+         { return IDENTIFIER; }
{STRING}               { return VALUE; }
[a-zA-Z0-9\.\(\)\;\&]+ { return VALUE; }

<IMPORT> [^\n]+               { yybegin(YYINITIAL); return MODULE; }


[^] { return BAD_CHARACTER; }