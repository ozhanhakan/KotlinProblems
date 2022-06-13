fun main() {
    // write your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    println(
        if (a + b > c && a + c > b && b + c > a) {
            "YES"
        } else {
            "NO"
        }
    )
}