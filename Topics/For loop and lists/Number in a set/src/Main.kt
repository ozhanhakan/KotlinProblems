fun main() {
    // write your code here
    val inputList = MutableList<Int>(readLine()!!.toInt()) { readLine()!!.toInt() }
    val mNumber = readln().toInt()
    println(if (inputList.contains(mNumber)) "YES" else "NO")
}