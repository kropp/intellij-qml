package name.kropp.intellij.qml;

import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage

class QmlColorSettingsPage : ColorSettingsPage {
  override fun getDisplayName() = QmlLanguage.displayName
  override fun getIcon() = QmlIcon

  private val tags = mapOf(
      "id" to QmlSyntaxHighlighter.ID,
      "attribute" to QmlSyntaxHighlighter.ATTRIBUTE,
      "type" to QmlSyntaxHighlighter.TYPE
  )

  private val DESCRIPTORS = arrayOf(
      AttributesDescriptor("Keyword", QmlSyntaxHighlighter.KEYWORD),
      AttributesDescriptor("Type Name", QmlSyntaxHighlighter.TYPE),
      AttributesDescriptor("Attribute", QmlSyntaxHighlighter.ATTRIBUTE),
      AttributesDescriptor("Id Attribute", QmlSyntaxHighlighter.ID),
      AttributesDescriptor("String", QmlSyntaxHighlighter.STRING),
      AttributesDescriptor("Number", QmlSyntaxHighlighter.NUMBER),
      AttributesDescriptor("Boolean value", QmlSyntaxHighlighter.BOOLEAN)
  )

  override fun getAttributeDescriptors() = DESCRIPTORS
  override fun getHighlighter() = QmlSyntaxHighlighter()

  override fun getDemoText() = """import QtQuick 2.7

<type>ApplicationWindow</type> {
    <id>id</id>: mainWindow
    <attribute>visible</attribute>: true

    <attribute>title</attribute>: "Demo App"
    <attribute>width</attribute>: 440
    <attribute>height</attribute>: 700

    <attribute>menuBar: <type>MenuBar</type> {
        Menu {
            <attribute>title</attribute>: qsTr("File")
            <type>MenuItem</type> {
                <attribute>text</attribute>: qsTr("&Open")
                <attribute>onTriggered</attribute>: console.log("Open action triggered");
            }
            <type>MenuItem</type> {
                <attribute>text</attribute>: qsTr("Exit")
                <attribute>onTriggered</attribute>: Qt.quit();
            }
        }
    }

    <type>Button</type> {
        <attribute>text</attribute>: "Hello World"
        <attribute>anchors.horizontalCenter</attribute>: parent.horizontalCenter
        <attribute>anchors.verticalCenter</attribute>: parent.verticalCenter
    }
}"""

  override fun getAdditionalHighlightingTagToDescriptorMap() = tags
  override fun getColorDescriptors() = ColorDescriptor.EMPTY_ARRAY
}