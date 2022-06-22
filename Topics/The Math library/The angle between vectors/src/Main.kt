import kotlin.math.PI
import kotlin.math.acos
import kotlin.math.hypot
import kotlin.math.roundToInt

fun main() {
    // put your code here
    val (a1, a2) = readln().split(" ").map { it.toDouble() }.toMutableList()
    val (b1, b2) = readln().split(" ").map { it.toDouble() }.toMutableList()
//    println("a1:$a1, a2:$a2, b1:$b1, b2:$b2")
    val aHypot = hypot(a1, a2)
//    println(aHypot)
    val bHypot = hypot(b1, b2)
//    println(bHypot)
    val abDotProduct = a1 * b1 + a2 * b2
//    println(abDotProduct)
    val cosTeta = abDotProduct / (aHypot * bHypot)
//    println(cosTeta)
    val teta = acos(cosTeta)
    println(angleFromRadien(teta).roundToInt())
}

fun angleFromRadien(radienAngle: Double): Double {
    return (radienAngle / PI) * 180.0
}