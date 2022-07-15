import java.awt.Color
import java.awt.image.BufferedImage

const val HEIGHT = 500
const val WIDTH = 500
const val SQUARE_LENGTH = 300
const val X1 = 100
const val Y1 = 100

fun drawSquare(): BufferedImage {
    val image = BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()
    // a red one, starting at position (0, 0) and ending at position (200, 200);
    graphics.color = Color.RED
    graphics.drawRect(X1, Y1, SQUARE_LENGTH, SQUARE_LENGTH)
    return image
}