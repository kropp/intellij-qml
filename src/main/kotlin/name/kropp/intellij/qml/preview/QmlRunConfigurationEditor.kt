package name.kropp.intellij.qml.preview

import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.util.ui.FormBuilder
import com.intellij.util.ui.UIUtil
import javax.swing.JPanel

class QmlRunConfigurationEditor : SettingsEditor<QmlRunConfiguration>() {
  private val filenameField = TextFieldWithBrowseButton()

  private val panel: JPanel by lazy {
    FormBuilder.createFormBuilder()
        .setAlignLabelOnRight(false)
        .setHorizontalGap(UIUtil.DEFAULT_HGAP)
        .setVerticalGap(UIUtil.DEFAULT_VGAP)
        .addLabeledComponent("&Filename", filenameField)
        .panel
  }

  override fun createEditor() = panel

  override fun applyEditorTo(configuration: QmlRunConfiguration) {
    //configuration.filename = filenameField.text
  }

  override fun resetEditorFrom(configuration: QmlRunConfiguration) {
    //filenameField.text = configuration.filename
  }
}