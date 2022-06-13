fun main() {
    // put your code here
    val numberList = mutableListOf<Int>()
    var checkNumber = readln().toInt()
    while (checkNumber != 0) {
        numberList.add(checkNumber)
        checkNumber = readln().toInt()
    }
    println(numberList.count())
}