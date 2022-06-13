fun main() {
    // write your code here
    val min = readln().toInt()
    val max = readln().toInt()
    val actual = readln().toInt()
    println(
        if (actual in min..max) {
            "Normal"
        } else if (actual < min) {
            "Deficiency"
        } else {
            "Excess"
        }
    )
}