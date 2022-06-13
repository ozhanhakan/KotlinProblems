fun main() {
    val list = MutableList<Int>(readLine()!!.toInt()) { readLine()!!.toInt() }
    var rotateTimes = readln().toInt()
    rotateTimes %= list.size
    repeat(rotateTimes) {
        list.add(0, list.removeLast())
    }
    println(list.joinToString(" "))
}