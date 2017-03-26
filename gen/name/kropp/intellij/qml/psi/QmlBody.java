// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.qml.psi;

import org.jetbrains.annotations.NotNull;

import java.util.List;

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
