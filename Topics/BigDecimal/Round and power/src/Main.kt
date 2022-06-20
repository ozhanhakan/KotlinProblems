import java.math.RoundingMode

fun main() {
    val power = readln().toInt()
    val mode = readln().toInt()
    var number = readln().toBigDecimal()
    number = number.setScale(mode, RoundingMode.FLOOR)
    val result = number.pow(power)
    println(result)
}