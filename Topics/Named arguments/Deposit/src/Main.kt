import kotlin.math.pow

fun main() {
    // write your code here
    val inputName = readln()
    val valueOfParamater = readln().toInt()
    println(
        when (inputName) {
            "amount" -> finalAmount(amount = valueOfParamater).toInt()
            "percent" -> finalAmount(percent = valueOfParamater).toInt()
            "years" -> finalAmount(years = valueOfParamater).toInt()
            else -> finalAmount().toInt()
        }
    )


}

fun finalAmount(
    amount: Int = 1000,
    percent: Int = 5,
    years: Int = 10
): Double {
    return amount * (((1 + percent / 100.0)).pow(years))

}