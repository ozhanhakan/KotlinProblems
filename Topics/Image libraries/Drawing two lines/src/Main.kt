import java.awt.Color
import java.awt.image.BufferedImage

fun drawLines(): BufferedImage {
    val height: Int = 200
    val width: Int = 200

    val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)
    val graphics = image.createGraphics()
    // a red one, starting at position (0, 0) and ending at position (200, 200);
    graphics.color = Color.RED
    var x1 = 0
    var y1 = 0
    var x2 = 200
    var y2 = 200
    graphics.drawLine(x1, y1, x2, y2)

    // a green one, starting at position (200, 0) and ending at position (0, 200).
    graphics.color = Color.GREEN
    x1 = 200
    y1 = 0
    x2 = 0
    y2 = 200
    graphics.drawLine(x1, y1, x2, y2)
    return image
}
/*
fun main(){

}*/
