fun main() {
    val size = readln().toInt()
    val array = IntArray(size)
    var max = array[0]
    for (i in 0..array.lastIndex) {
        array[i] = readln().toInt()
        if (max <= array[i]) max = array[i]
    }
    for (i in array.indices) {
        if (max == array[i]) {
            println(i)
            break
        }
    }

}