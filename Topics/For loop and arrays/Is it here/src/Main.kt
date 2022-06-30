fun main() {
    val numberN = readln().toInt()
    val array = IntArray(numberN)
    for (i in array.indices) {
        array[i] = readln().toInt()
    }
    val numberM = readln().toInt()
    if (array.contains(numberM)) println("YES") else println("NO")
}