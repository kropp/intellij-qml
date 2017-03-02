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

COMMENT="//"[^\r\n]*

%state TMP

%%

{COMMENT}              { return COMMENT; }

[^] { return BAD_CHARACTER; }