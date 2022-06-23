fun stringToMap(first: String, second: String, third: String): Map<String, Int> {
    return buildMap<String, Int> {
        put(first, first.length)
        put(second, second.length)
        put(third, third.length)
    }
}
/*
fun main() {
    println(stringToMap("I", "love", "Kotlin"))
    println(stringToMap("Strings", "Ints", "Objects"))

    var perfect = 0
    var larger = 0
    var rejects = 0
    val inputList: MutableList<Int> = mutableListOf()
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        // inputList.add(readLine()!!.toInt())
        val input = readln().toInt()
        when (input) {
            -1 -> rejects++
            0 -> perfect++
            1 -> larger++
        }
    }
    println("$perfect $larger $rejects")
}*/
