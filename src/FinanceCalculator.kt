import java.awt.Toolkit
import javax.swing.JFrame

class FinanceCalculator : JFrame() {
    init {
        isVisible = true
        isResizable = false
        setSize(590, 320)
        val toolkit = Toolkit.getDefaultToolkit()
        val dimension = toolkit.screenSize
        setLocation(dimension.width / 2 - 295, dimension.height / 2 - 160)

        title = "Finance calculator"

        defaultCloseOperation = EXIT_ON_CLOSE

        add(gui)
    }

    companion object {
        private val gui: GUI = GUI()

        // Основной метод main
        @JvmStatic
        fun main(args: Array<String>) {
            val fc = FinanceCalculator()

            gui.repaint()
        }
    }
}
