// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface QmlBody extends QmlPsiElement {

  @NotNull
  List<QmlAttributeAssignment> getAttributeAssignmentList();

  @NotNull
  List<QmlMethodAttribute> getMethodAttributeList();

  @NotNull
  List<QmlPropertyDefinition> getPropertyDefinitionList();

  @NotNull
  List<QmlSignalDefinition> getSignalDefinitionList();

}
