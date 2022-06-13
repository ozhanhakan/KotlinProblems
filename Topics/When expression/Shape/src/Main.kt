fun main(args: Array<String>) {
    // write your code here
    val input = readln().toInt()
    println(
        when (input) {
            1 -> "You have chosen a square"
            2 -> "You have chosen a circle"
            3 -> "You have chosen a triangle"
            4 -> "You have chosen a rhombus"
            else -> "There is no such shape!"
        }
    )
}