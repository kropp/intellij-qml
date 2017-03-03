// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import name.kropp.intellij.qml.psi.impl.*;

public interface QmlTypes {

  IElementType COMMENT = new QmlElementType("COMMENT");
  IElementType IMPORT = new QmlElementType("IMPORT");
  IElementType OBJECT = new QmlElementType("OBJECT");

  IElementType FIELDS = new QmlTokenType("fields");
  IElementType IMPORT_$ = new QmlTokenType("import_$");
  IElementType KEYWORD_IMPORT = new QmlTokenType("import");
  IElementType LBRACE = new QmlTokenType("{");
  IElementType MODULE = new QmlTokenType("module");
  IElementType RBRACE = new QmlTokenType("}");
  IElementType TYPENAME = new QmlTokenType("typename");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == COMMENT) {
        return new QmlCommentImpl(node);
      }
      else if (type == IMPORT) {
        return new QmlImportImpl(node);
      }
      else if (type == OBJECT) {
        return new QmlObjectImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
