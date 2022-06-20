import java.math.BigInteger

const val EXBI_BITS = 63

fun main() {
    /*val exbi = BigInteger("9223372036854775808")
    // write your code here
    val exbiNumber = readln().toInt()
    val result = exbiNumber.toBigInteger() * exbi
    println(result)*/
    println(readln().toBigInteger() * BigInteger.TWO.pow(EXBI_BITS))
}