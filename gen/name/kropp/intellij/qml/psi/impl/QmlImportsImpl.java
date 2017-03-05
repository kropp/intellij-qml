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

public class QmlImportsImpl extends ASTWrapperPsiElement implements QmlImports {

  public QmlImportsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull QmlVisitor visitor) {
    visitor.visitImports(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof QmlVisitor) accept((QmlVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<QmlImport> getImportList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, QmlImport.class);
  }

}
