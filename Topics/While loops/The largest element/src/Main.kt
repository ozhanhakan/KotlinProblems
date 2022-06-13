fun main() {
    var inputNumber = readln().toInt()
    var largest = Int.MIN_VALUE
    while (inputNumber != 0) {
        if (inputNumber > largest) largest = inputNumber
        inputNumber = readln().toInt()
    }
    println(largest)
}