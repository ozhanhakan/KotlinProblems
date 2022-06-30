fun main() {
    var countM = 0
    val numberN = readln().toInt()
    if (numberN > 0) {
        val array = IntArray(numberN)
        for (i in 0..array.lastIndex) {
            array[i] = readln().toInt()
        }
        val numberM = readln().toInt()
        for (i in 0..array.lastIndex) {
            if (numberM == array[i]) countM++
        }
    }
    print(countM)

}