import java.util.*

enum class Currency(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar");

    companion object {
        fun isCurrency(country: String): Boolean {
            for (enum in Currency.values()) {
                if (country == enum.name) return true
            }
            return false
        }
    }
}

fun main() {
    // put your code here
    val (country1, country2) = readln().split(" ")
        .map { it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } }
    /*println(country1)
    println(country2)*/
    if (Currency.isCurrency(country1) && Currency.isCurrency(country2))
        println(Currency.valueOf(country1).currency == Currency.valueOf(country2).currency)
    else
        println(false)
}