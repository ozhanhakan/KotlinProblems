// You can experiment here, it won’t be checked
fun isNumeric(toCheck: String): Boolean {
    return toCheck.all { char -> char.isDigit() }
}
fun main(args: Array<String>) {
  // put your code here
    val number = readln()

    println(
        when (isNumeric(number)) {
            (number.toInt() >= 0) -> number.length
            else -> "error!"
        }
    )
}
