fun main() {
    val a = readln().toBigInteger()
    val b = readln().toBigInteger()
    print("${100.toBigInteger() * a / (a + b)}% ")
    print("${100.toBigInteger() * b / (a + b)}%")
    // Alternative solution 2% 98%
    // print("${100.toBigInteger() - 100.toBigInteger() * a / (a + b)}% ")
}