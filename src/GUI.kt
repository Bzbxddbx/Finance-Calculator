import Config.Config
import java.awt.event.ActionListener
import java.text.DecimalFormat
import javax.swing.JPanel

class GUI : JPanel() {
    init {
        setBounds(0, 0, 590, 320) // Установка размера и расположения панели
        background = Config.mainColor
        layout = null

        i.addInterfaceElements(this)
        buttonFunctional()
    }

    companion object {
        private val df = DecimalFormat("0.00")

        private val config: Config = Config()
        private val i: CreateInterface = CreateInterface()

        private fun buttonFunctional() {
            CreateInterface.calculateButton?.addActionListener(ActionListener
            // Анонимный класс для действий при нажатии кнопки
            {
                calculate() // Вызов метода для создания labels из класса resultPanel
            })

            CreateInterface.button?.addActionListener(ActionListener { })
        }

        private fun calculate() {
            try {
                val value: Double = CreateInterface.inputField!!.getText().toDouble() // Получение числа с поля ввода

                // Создание переменных, которые хранят в себе количество денег, умноженное на соответственные проценты
                val pocketMoney: Double = value * config.percent1
                val averageTarget: Double = value * config.percent2
                val investments: Double = value * config.percent3

                // Изменение текста в надписях
                CreateInterface.pocketMoneyLabel?.setText(
                    String.format(
                        "На карманные расходы: %s рублей",
                        df.format(pocketMoney)
                    )
                )
                CreateInterface.averageTargetLabel?.setText(
                    String.format(
                        "На мечту: %s рублей",
                        df.format(averageTarget)
                    )
                )
                CreateInterface.investmentsLabel?.setText(
                    String.format(
                        "На инвестиции: %s рублей",
                        df.format(investments)
                    )
                )
            } catch (ex: NumberFormatException) {    // Проверка на ввод не числа
                CreateInterface.pocketMoneyLabel?.setText("Пожалуйста, введите число")
                CreateInterface.averageTargetLabel?.setText("")
                CreateInterface.investmentsLabel?.setText("")
            }
        }
    }
}