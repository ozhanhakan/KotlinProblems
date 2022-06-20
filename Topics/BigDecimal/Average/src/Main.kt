import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val a = readln().toBigDecimal()
    val b = readln().toBigDecimal()
    val c = readln().toBigDecimal()
    println((a + b + c).setScale(0, RoundingMode.DOWN) / BigDecimal("3"))
}