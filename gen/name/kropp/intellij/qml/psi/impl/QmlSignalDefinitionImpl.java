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

public class QmlSignalDefinitionImpl extends ASTWrapperPsiElement implements QmlSignalDefinition {

  public QmlSignalDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QmlVisitor visitor) {
    visitor.visitSignalDefinition(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QmlVisitor) accept((QmlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public QmlSignal getSignal() {
    return findNotNullChildByClass(QmlSignal.class);
  }

  @Override
  @NotNull
  public List<QmlSignalParameter> getSignalParameterList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlSignalParameter.class);
  }

}
