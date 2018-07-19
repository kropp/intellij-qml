// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static name.kropp.intellij.qml.psi.QmlTypes.*;
import name.kropp.intellij.qml.psi.QmlFilenameMixin;
import name.kropp.intellij.qml.psi.*;

public class QmlFilenameImpl extends QmlFilenameMixin implements QmlFilename {

  public QmlFilenameImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QmlVisitor visitor) {
    visitor.visitFilename(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QmlVisitor) accept((QmlVisitor)visitor);
    else super.accept(visitor);
  }

  @NotNull
  public QmlFilename updateText(@NotNull String newText) {
    return QmlPsiImplUtil.updateText(this, newText);
  }

}
