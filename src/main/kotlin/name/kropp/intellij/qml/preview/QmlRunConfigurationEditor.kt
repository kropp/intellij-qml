package name.kropp.intellij.qml.preview

import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.ui.components.CheckBox
import com.intellij.ui.components.JBRadioButton
import com.intellij.util.ui.FormBuilder
import com.intellij.util.ui.RadioButtonEnumModel
import com.intellij.util.ui.UIUtil
import javax.swing.ButtonGroup
import javax.swing.JPanel

class QmlRunConfigurationEditor : SettingsEditor<QmlRunConfiguration>() {
  private val filenameField = TextFieldWithBrowseButton()
  private val sizeRadioPanel = JPanel()
  private val sizeRadioModel: RadioButtonEnumModel<QmlSceneSize>
  private val renderingRadioPanel = JPanel()
  private val renderingRadioModel: RadioButtonEnumModel<QmlSceneRendering>
  private val slowAnimationsCheckbox = CheckBox("Slow animations")

  init {
    sizeRadioModel = createRadioGroup(sizeRadioPanel)
    renderingRadioModel = createRadioGroup(renderingRadioPanel)
  }

  private inline fun <reified T> createRadioGroup(panel: JPanel): RadioButtonEnumModel<T>
    where T : Enum<T>, T : QmlSceneOption {
    val group = ButtonGroup()
    enumValues<T>().map { JBRadioButton(it.description) }.forEach {
      it.setMnemonic(it.text.first())
      panel.add(it)
      group.add(it)
    }
    val model = RadioButtonEnumModel.bindEnum(T::class.java, group)
    model.selected = enumValues<T>().first()
    return model
  }

  private val panel: JPanel by lazy {
    FormBuilder.createFormBuilder()
        .setAlignLabelOnRight(false)
        .setHorizontalGap(UIUtil.DEFAULT_HGAP)
        .setVerticalGap(UIUtil.DEFAULT_VGAP)
        .addLabeledComponent("&Filename", filenameField)
        .addLabeledComponent("&Window size", sizeRadioPanel)
        .addLabeledComponent("&Rendering", renderingRadioPanel)
        .addComponent(slowAnimationsCheckbox)
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