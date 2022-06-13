import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var errorPayment = false
    while (scanner.hasNextInt()) {
        val payment = scanner.nextInt()

        if (balance >= payment) {
            balance -= payment
        } else {
            errorPayment = true
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $payment.")
        }
    }
    if (balance >= 0 && !errorPayment) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}