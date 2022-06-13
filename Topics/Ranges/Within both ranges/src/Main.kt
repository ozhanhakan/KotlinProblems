fun main() {
    // write your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val e = readln().toInt()
    val within = e in a..b && e in c..d
    println(within)
}