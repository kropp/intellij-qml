package name.kropp.intellij.qml

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import name.kropp.intellij.qml.psi.QmlAttribute
import name.kropp.intellij.qml.psi.QmlType

class QmlAnnotator : Annotator {
  override fun annotate(element: PsiElement, holder: AnnotationHolder) {
    if (element is QmlType) {
      holder.createInfoAnnotation(element, null).textAttributes = QmlSyntaxHighlighter.TYPE
    } else if (element is QmlAttribute) {
      if (element.text == "id") {
        holder.createInfoAnnotation(element, null).textAttributes = QmlSyntaxHighlighter.ID
      } else {
        holder.createInfoAnnotation(element, null).textAttributes = QmlSyntaxHighlighter.ATTRIBUTE
      }
    }
  }
}