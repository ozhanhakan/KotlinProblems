import java.awt.Color
import java.awt.image.BufferedImage

const val HELLO_IMAGES = "Hello, images!"
fun drawStrings(): BufferedImage {
    val image = BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()
    graphics.color = Color.RED
    graphics.drawString(HELLO_IMAGES, 50, 50)
    graphics.color = Color.GREEN
    graphics.drawString(HELLO_IMAGES, 51, 51)
    graphics.color = Color.BLUE
    graphics.drawString(HELLO_IMAGES, 52, 52)
    return image
}