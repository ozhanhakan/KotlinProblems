import java.math.RoundingMode

fun main() {
    // write your code here
    var a = readln().toBigDecimal()
    val newScale = readln().toInt()
    a = a.setScale(newScale, RoundingMode.HALF_DOWN)
    println(a)
}