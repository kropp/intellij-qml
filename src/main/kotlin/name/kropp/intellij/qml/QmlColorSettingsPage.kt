package name.kropp.intellij.qml;

import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage

class QmlColorSettingsPage : ColorSettingsPage {
  override fun getDisplayName() = QmlLanguage.displayName
  override fun getIcon() = QmlIcon

  private val tags = mapOf(
      "id" to QmlSyntaxHighlighter.ID,
      "property" to QmlSyntaxHighlighter.PROPERTY,
      "typeName" to QmlSyntaxHighlighter.TYPE_NAME
  )

  private val DESCRIPTORS = arrayOf(
      AttributesDescriptor("Keyword", QmlSyntaxHighlighter.KEYWORD),
      AttributesDescriptor("Type Name", QmlSyntaxHighlighter.TYPE_NAME),
      AttributesDescriptor("Property", QmlSyntaxHighlighter.PROPERTY),
      AttributesDescriptor("Id Property", QmlSyntaxHighlighter.ID),
      AttributesDescriptor("String", QmlSyntaxHighlighter.STRING),
      AttributesDescriptor("Number", QmlSyntaxHighlighter.NUMBER),
      AttributesDescriptor("Boolean value", QmlSyntaxHighlighter.BOOLEAN)
  )

  override fun getAttributeDescriptors() = DESCRIPTORS
  override fun getHighlighter() = QmlSyntaxHighlighter()

  override fun getDemoText() = """import QtQuick 2.7

<typeName>ApplicationWindow</typeName> {
    <id>id</id>: mainWindow
    <property>visible</property>: true

    <property>title</property>: "Demo App"
    <property>width</property>: 440
    <property>height</property>: 700

    <property>menuBar: <typeName>MenuBar</typeName> {
        Menu {
            <property>title</property>: qsTr("File")
            <typeName>MenuItem</typeName> {
                <property>text</property>: qsTr("&Open")
                <property>onTriggered</property>: console.log("Open action triggered");
            }
            <typeName>MenuItem</typeName> {
                <property>text</property>: qsTr("Exit")
                <property>onTriggered</property>: Qt.quit();
            }
        }
    }

    <typeName>Button</typeName> {
        <property>text</property>: "Hello World"
        <property>anchors.horizontalCenter</property>: parent.horizontalCenter
        <property>anchors.verticalCenter</property>: parent.verticalCenter
    }
}"""

  override fun getAdditionalHighlightingTagToDescriptorMap() = tags
  override fun getColorDescriptors() = ColorDescriptor.EMPTY_ARRAY
}