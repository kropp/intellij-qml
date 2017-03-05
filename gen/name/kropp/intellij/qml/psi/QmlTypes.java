// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import name.kropp.intellij.qml.psi.impl.*;

public interface QmlTypes {

  IElementType BODY = new QmlElementType("BODY");
  IElementType COMMENT = new QmlElementType("COMMENT");
  IElementType IMPORT = new QmlElementType("IMPORT");
  IElementType IMPORTS = new QmlElementType("IMPORTS");
  IElementType OBJECT = new QmlElementType("OBJECT");
  IElementType PROPERTIES = new QmlElementType("PROPERTIES");
  IElementType PROPERTY = new QmlElementType("PROPERTY");
  IElementType PROPERTY_NAME = new QmlElementType("PROPERTY_NAME");
  IElementType TYPE_NAME = new QmlElementType("TYPE_NAME");

  IElementType COLON = new QmlTokenType(":");
  IElementType FALSE = new QmlTokenType("false");
  IElementType IDENTIFIER = new QmlTokenType("identifier");
  IElementType IMPORT_$ = new QmlTokenType("import_$");
  IElementType KEYWORD_IMPORT = new QmlTokenType("import");
  IElementType LBRACE = new QmlTokenType("{");
  IElementType MODULE = new QmlTokenType("module");
  IElementType NUMBER = new QmlTokenType("number");
  IElementType RBRACE = new QmlTokenType("}");
  IElementType STRING = new QmlTokenType("string");
  IElementType TRUE = new QmlTokenType("true");
  IElementType VALUE = new QmlTokenType("value");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == BODY) {
        return new QmlBodyImpl(node);
      }
      else if (type == COMMENT) {
        return new QmlCommentImpl(node);
      }
      else if (type == IMPORT) {
        return new QmlImportImpl(node);
      }
      else if (type == IMPORTS) {
        return new QmlImportsImpl(node);
      }
      else if (type == OBJECT) {
        return new QmlObjectImpl(node);
      }
      else if (type == PROPERTIES) {
        return new QmlPropertiesImpl(node);
      }
      else if (type == PROPERTY) {
        return new QmlPropertyImpl(node);
      }
      else if (type == PROPERTY_NAME) {
        return new QmlPropertyNameImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new QmlTypeNameImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
