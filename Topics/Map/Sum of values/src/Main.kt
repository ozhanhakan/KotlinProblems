fun summator(map: Map<Int, Int>): Int {
    var sum = 0
    for ((k, v) in map) if (k % 2 == 0) sum += v
    return sum
}
/*

fun main() {
    println(summator(mapOf(100 to 10, 55 to 3, 112 to 5)))
    println(summator(mapOf(1 to 2, 10 to 5)))
}*/
