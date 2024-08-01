package Config

import java.awt.Color
import java.awt.Font

class Config {
    var percent1: Double = 0.15
    var percent2: Double = 0.55
    var percent3: Double = 0.30

    companion object {
        val font: Font = Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 20)
        val buttonFont: Font = Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 32)
        val titleFont: Font = Font("Bahnschrift SemiBold SemiConden", Font.BOLD, 30)

        val turquoise: Color = Color(92, 250, 176)
        val mainColor: Color = Color(21, 21, 38)
        val textFieldColor: Color = Color(23, 37, 59)
    }
}