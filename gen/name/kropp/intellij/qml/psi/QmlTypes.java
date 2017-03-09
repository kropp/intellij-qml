// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import name.kropp.intellij.qml.psi.impl.*;

public interface QmlTypes {

  IElementType ATTRIBUTE = new QmlElementType("ATTRIBUTE");
  IElementType ATTRIBUTE_ASSIGNMENT = new QmlElementType("ATTRIBUTE_ASSIGNMENT");
  IElementType BLOCK_COMMENT = new QmlElementType("BLOCK_COMMENT");
  IElementType BODY = new QmlElementType("BODY");
  IElementType IMPORT = new QmlElementType("IMPORT");
  IElementType IMPORTS = new QmlElementType("IMPORTS");
  IElementType LINE_COMMENT = new QmlElementType("LINE_COMMENT");
  IElementType MODULE = new QmlElementType("MODULE");
  IElementType OBJECT = new QmlElementType("OBJECT");
  IElementType QUALIFIER = new QmlElementType("QUALIFIER");
  IElementType TYPE = new QmlElementType("TYPE");
  IElementType VERSION = new QmlElementType("VERSION");

  IElementType COLON = new QmlTokenType(":");
  IElementType FALSE = new QmlTokenType("false");
  IElementType FLOAT = new QmlTokenType("float");
  IElementType IDENTIFIER = new QmlTokenType("identifier");
  IElementType IMPORT_$ = new QmlTokenType("import_$");
  IElementType INTEGER = new QmlTokenType("integer");
  IElementType KEYWORD_AS = new QmlTokenType("as");
  IElementType KEYWORD_IMPORT = new QmlTokenType("import");
  IElementType LBRACE = new QmlTokenType("{");
  IElementType RBRACE = new QmlTokenType("}");
  IElementType STRING = new QmlTokenType("string");
  IElementType TRUE = new QmlTokenType("true");
  IElementType VALUE = new QmlTokenType("value");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ATTRIBUTE) {
        return new QmlAttributeImpl(node);
      }
      else if (type == ATTRIBUTE_ASSIGNMENT) {
        return new QmlAttributeAssignmentImpl(node);
      }
      else if (type == BLOCK_COMMENT) {
        return new QmlBlockCommentImpl(node);
      }
      else if (type == BODY) {
        return new QmlBodyImpl(node);
      }
      else if (type == IMPORT) {
        return new QmlImportImpl(node);
      }
      else if (type == IMPORTS) {
        return new QmlImportsImpl(node);
      }
      else if (type == LINE_COMMENT) {
        return new QmlLineCommentImpl(node);
      }
      else if (type == MODULE) {
        return new QmlModuleImpl(node);
      }
      else if (type == OBJECT) {
        return new QmlObjectImpl(node);
      }
      else if (type == QUALIFIER) {
        return new QmlQualifierImpl(node);
      }
      else if (type == TYPE) {
        return new QmlTypeImpl(node);
      }
      else if (type == VERSION) {
        return new QmlVersionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
