@Suppress("MagicNumber")
fun main() {
    val input = readln().toDouble()
    val firstFract = (input * 10.0).toInt()
    println(firstFract % 10)
}
