const val VALUES = 2
fun main() {
    List(VALUES) { readln().toDouble() }.let { println(it.last() - it.first()) }
    /*
    val (a, b) = List(VALUES) { readln().toDouble() }
    println(b - a)
    */
}