package name.kropp.intellij.qml

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.ExtensionFileNameMatcher
import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory
import com.intellij.openapi.fileTypes.LanguageFileType

val QmlIcon = AllIcons.FileTypes.UiForm!!

object QmlFileType : LanguageFileType(QmlLanguage) {
  override fun getIcon() = QmlIcon
  override fun getName() = "QML"
  override fun getDescription() = "Qt User Interface Markup Language"
  override fun getDefaultExtension() = "qml"
}

object QmlFileTypeFactory : FileTypeFactory() {
  override fun createFileTypes(consumer: FileTypeConsumer) {
    consumer.consume(QmlFileType, ExtensionFileNameMatcher("qml"), ExtensionFileNameMatcher("qmltypes"))
  }
}