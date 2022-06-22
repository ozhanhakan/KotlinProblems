import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

fun main() {
    // put your code here
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    val discriminant = sqrt(b * b - 4 * a * c)
    val x1 = (-b - discriminant) / (2 * a)
    val x2 = (-b + discriminant) / (2 * a)
    println("${min(x1, x2)} ${max(x1, x2)}")
}