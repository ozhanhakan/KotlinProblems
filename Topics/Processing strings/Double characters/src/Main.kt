const val TIMES = 2
fun main() {
    val str = readln()
    for (i in str) repeat(TIMES) { print(i) }
}