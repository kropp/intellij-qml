// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import name.kropp.intellij.qml.psi.impl.*;

public interface QmlTypes {

  IElementType COMMENT = new QmlElementType("COMMENT");


  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == COMMENT) {
        return new QmlCommentImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
