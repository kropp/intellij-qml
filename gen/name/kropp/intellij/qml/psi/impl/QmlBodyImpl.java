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

public class QmlBodyImpl extends ASTWrapperPsiElement implements QmlBody {

  public QmlBodyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QmlVisitor visitor) {
    visitor.visitBody(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QmlVisitor) accept((QmlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<QmlAttributeAssignment> getAttributeAssignmentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlAttributeAssignment.class);
  }

  @Override
  @NotNull
  public List<QmlMethodAttribute> getMethodAttributeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlMethodAttribute.class);
  }

  @Override
  @NotNull
  public List<QmlPropertyDefinition> getPropertyDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlPropertyDefinition.class);
  }

  @Override
  @NotNull
  public List<QmlSignalDefinition> getSignalDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlSignalDefinition.class);
  }

}
