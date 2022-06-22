import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    // write your code here
    val population = readln().toInt()
    // println( population.toDouble().pow(1.0/3.0))
    println(population.toDouble().pow(1.0 / 3.0).roundToInt())
}