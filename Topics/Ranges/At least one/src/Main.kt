const val LISTE_BOYUTU: Int = 5
fun main() {
    // write your code here
    /*val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    val e = readln().toInt()*/
    val (a, b, c, d, e) = MutableList(LISTE_BOYUTU) { readln().toInt() }
    val within = e in a..b || e in c..d
    println(within)
}