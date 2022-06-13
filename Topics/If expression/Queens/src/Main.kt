import kotlin.math.abs

const val ZERO = 0
fun main() {
    // write your code here
    val (x1, y1) = readln().split(' ').map { it.toInt() }

    val (x2, y2) = readln().split(' ').map { it.toInt() }
    val horizontal = x1 - x2 == ZERO || y1 - y2 == ZERO
    val diagonal = abs(x1 - x2) == abs(y1 - y2)
    if (horizontal || diagonal) println("YES") else println("NO")
    /*println(
        if (x1.toInt() == x2.toInt()){
            "YES"
        } else if(y1.toInt() == y2.toInt()){
            "YES"
        } else if(abs(x1.toInt()-x2.toInt()) == abs(y1.toInt()-y2.toInt())){
            "YES"
        } else{
            "NO"
        }
    )*/

}
