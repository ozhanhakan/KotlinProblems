fun main() {
    // write your code here
    val numbers = readln().toInt()
    var minNumber = Int.MAX_VALUE
    for (i in 1..numbers) {
        val input = readln().toInt()
        minNumber = if (input < minNumber) input else minNumber
    }
    println(minNumber)

}