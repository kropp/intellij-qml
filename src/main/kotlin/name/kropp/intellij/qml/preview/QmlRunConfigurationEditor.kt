package name.kropp.intellij.qml.preview

import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.ui.components.CheckBox
import com.intellij.ui.components.JBRadioButton
import com.intellij.util.ui.FormBuilder
import com.intellij.util.ui.RadioButtonEnumModel
import com.intellij.util.ui.UIUtil
import java.awt.FlowLayout
import javax.swing.ButtonGroup
import javax.swing.JPanel

class QmlRunConfigurationEditor : SettingsEditor<QmlRunConfiguration>() {
  private val qmlsceneField = TextFieldWithBrowseButton()
  private val filenameField = TextFieldWithBrowseButton()
  private val sizeRadioPanel = JPanel(FlowLayout(FlowLayout.LEFT))
  private val sizeRadioModel: RadioButtonEnumModel<QmlSceneSize>
  private val renderingRadioPanel = JPanel(FlowLayout(FlowLayout.LEFT))
  private val renderingRadioModel: RadioButtonEnumModel<QmlSceneRendering>
  private val scalingRadioPanel = JPanel(FlowLayout(FlowLayout.LEFT))
  private val scalingRadioModel: RadioButtonEnumModel<QmlSceneScaling>
  private val slowAnimationsCheckbox = CheckBox("Slow animations")

  init {
    sizeRadioModel = createRadioGroup(sizeRadioPanel)
    renderingRadioModel = createRadioGroup(renderingRadioPanel)
    scalingRadioModel = createRadioGroup(scalingRadioPanel)
  }

  private inline fun <reified T> createRadioGroup(panel: JPanel): RadioButtonEnumModel<T>
    where T : Enum<T>, T : QmlSceneOption {
    val group = ButtonGroup()
    enumValues<T>().map {
      JBRadioButton(it.description).apply {
        setMnemonic(it.description.first())
        toolTipText = it.tooltip
      }
    }.forEach {
      panel.add(it)
      group.add(it)
    }
    return RadioButtonEnumModel.bindEnum(T::class.java, group).apply {
      selected = enumValues<T>().first()
    }
  }

  private val panel: JPanel by lazy {
    FormBuilder.createFormBuilder()
        .setAlignLabelOnRight(false)
        .setHorizontalGap(UIUtil.DEFAULT_HGAP)
        .setVerticalGap(UIUtil.DEFAULT_VGAP)
        .addLabeledComponent("&qmlscene path", qmlsceneField)
        .addLabeledComponent("&Filename", filenameField)
        .addLabeledComponent("&Window size", sizeRadioPanel)
        .addLabeledComponent("&Rendering", renderingRadioPanel)
        .addLabeledComponent("&Scaling", scalingRadioPanel)
        .addComponent(slowAnimationsCheckbox)
        .panel
  }

  override fun createEditor() = panel

  override fun applyEditorTo(configuration: QmlRunConfiguration) {
    configuration.apply {
      qmlscenePath = qmlsceneField.text
      filename = filenameField.text
      size = sizeRadioModel.selected
      rendering = renderingRadioModel.selected
      scaling = scalingRadioModel.selected
      slowAnimations = slowAnimationsCheckbox.isSelected
    }
  }

  override fun resetEditorFrom(configuration: QmlRunConfiguration) {
    qmlsceneField.text = configuration.qmlscenePath
    filenameField.text = configuration.filename
    sizeRadioModel.selected = configuration.size
    renderingRadioModel.selected = configuration.rendering
    scalingRadioModel.selected = configuration.scaling
    slowAnimationsCheckbox.isSelected = configuration.slowAnimations
  }
}