const val ONE = 1
const val TEN = 10
const val HUNDRED = 100
fun main() {
    val numbers = IntArray(HUNDRED)
    numbers[0] = ONE
    numbers[TEN - 1] = TEN
    numbers[numbers.lastIndex] = HUNDRED

    // do not touch the lines below
    println(numbers.joinToString())
}