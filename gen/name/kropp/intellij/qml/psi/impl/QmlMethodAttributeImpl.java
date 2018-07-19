// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static name.kropp.intellij.qml.psi.QmlTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import name.kropp.intellij.qml.psi.*;

public class QmlMethodAttributeImpl extends ASTWrapperPsiElement implements QmlMethodAttribute {

  public QmlMethodAttributeImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QmlVisitor visitor) {
    visitor.visitMethodAttribute(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QmlVisitor) accept((QmlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public QmlMethod getMethod() {
    return findNotNullChildByClass(QmlMethod.class);
  }

  @Override
  @NotNull
  public QmlMethodBody getMethodBody() {
    return findNotNullChildByClass(QmlMethodBody.class);
  }

  @Override
  @NotNull
  public List<QmlParameter> getParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlParameter.class);
  }

}
