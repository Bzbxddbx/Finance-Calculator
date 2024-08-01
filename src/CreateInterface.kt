import Config.Config
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JTextField

class CreateInterface {
    init {
        createButtons()
        createTextField()
        createLabels()
    }

    fun addInterfaceElements(gui: GUI) {
        gui.add(inputField)
        gui.add(pocketMoneyLabel)
        gui.add(averageTargetLabel)
        gui.add(investmentsLabel)
        gui.add(titleLabel)
        gui.add(calculateButton)
        gui.add(settingsButton)
        gui.add(button)
    }

    companion object {
        var inputField: JTextField? = null

        var pocketMoneyLabel: JLabel? = null
        var averageTargetLabel: JLabel? = null
        var investmentsLabel: JLabel? = null
        var titleLabel: JLabel? = null

        var calculateButton: JButton? = null
        var settingsButton: JButton? = null
        var button: JButton? = null

        private fun createButtons() {
            calculateButton = JButton("Calc")
            calculateButton!!.setBounds(450, 20, 80, 30)
            calculateButton!!.background = Config.turquoise
            calculateButton!!.foreground = Config.mainColor
            calculateButton!!.border = null
            calculateButton!!.font = Config.font

            settingsButton = JButton("⚙")
            settingsButton!!.setBounds(40, 220, 40, 40)
            settingsButton!!.font = Config.buttonFont
            settingsButton!!.background = Config.turquoise
            settingsButton!!.foreground = Config.mainColor
            settingsButton!!.border = null

            button = JButton()
            button!!.setBounds(100, 220, 40, 40)
            button!!.font = Config.buttonFont
            button!!.background = Config.turquoise
            button!!.border = null
        }

        private fun createLabels() {
            // Создание пока что пустых надписей
            pocketMoneyLabel = JLabel(" ")
            averageTargetLabel = JLabel(" ")
            investmentsLabel = JLabel(" ")
            setLabelsFont() // Сохранение шрифта для надписей

            // Установка размера и расположения надписей
            pocketMoneyLabel!!.setBounds(40, 70, 600, 30)
            averageTargetLabel!!.setBounds(40, 110, 600, 30)
            investmentsLabel!!.setBounds(40, 150, 600, 30)

            titleLabel = JLabel("Finance calculator")
            titleLabel!!.setBounds(266, 220, 300, 40)
            titleLabel!!.foreground = Config.turquoise
            titleLabel!!.font = Config.titleFont
        }

        private fun setLabelsFont() {
            pocketMoneyLabel!!.font = Config.font
            averageTargetLabel!!.font = Config.font
            investmentsLabel!!.font = Config.font

            pocketMoneyLabel!!.foreground = Config.turquoise
            averageTargetLabel!!.foreground = Config.turquoise
            investmentsLabel!!.foreground = Config.turquoise
        }

        private fun createTextField() {
            inputField = JTextField(20)
            inputField!!.setBounds(40, 20, 400, 30)
            inputField!!.background = Config.textFieldColor
            inputField!!.foreground = Config.turquoise
            inputField!!.border = null
            inputField!!.font = Config.font
        }
    }
}