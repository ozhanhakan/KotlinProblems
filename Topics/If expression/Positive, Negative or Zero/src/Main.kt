fun main() {
    // write your code here
    val d = readln().toInt()
    val result = if (d < 0) {
        "negative"
    } else if (d > 0) {
        "positive"
    } else {
        "zero"
    }
    println(result)

}
