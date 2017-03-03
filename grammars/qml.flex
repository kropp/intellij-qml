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
WHITESPACE=[ \t\n]*

%state IMPORT OBJECT

%%

{COMMENT}              { return COMMENT; }
{WHITESPACE}           { return WHITE_SPACE; }
"import"               { yybegin(IMPORT); return KEYWORD_IMPORT; }
'\{'                   { yybegin(OBJECT); return LBRACE; }
'\}'                   { return RBRACE; }
[char_class]*          { return TYPENAME; }

<IMPORT> [^\n]*               { yybegin(YYINITIAL); return MODULE; }
<OBJECT> [^\}]*               { yybegin(YYINITIAL); return FIELDS; }

[^] { return BAD_CHARACTER; }