import java.util.Scanner

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val maxNumberList = mutableListOf<Int>()

    val firstNum = scanner.nextInt()
    maxNumberList.add(firstNum)

    var maxNumber: Int = Int.MIN_VALUE
    var newNumber: Int = firstNum
    while (scanner.hasNextInt()) {
        newNumber = scanner.nextInt()
        maxNumberList.add(newNumber)
    }
    maxNumber = maxNumberList.maxOrNull() ?: Int.MIN_VALUE
    println("$maxNumber ${maxNumberList.indexOf(maxNumber) + 1}")

}