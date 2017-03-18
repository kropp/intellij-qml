package name.kropp.intellij.qml.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiReference;
import com.intellij.psi.impl.source.resolve.reference.impl.providers.FileReferenceSet;
import org.jetbrains.annotations.NotNull;

public class QmlFilenameMixin extends ASTWrapperPsiElement {
    public QmlFilenameMixin(@NotNull ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public PsiReference[] getReferences() {
        return new FileReferenceSet(getNode().getPsi()).getAllReferences();
    }
}
