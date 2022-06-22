import kotlin.random.Random
import kotlin.random.nextInt

const val ONE = 1
const val TEN = 10
const val MIN = 33
const val MAX = 126
fun generatePredictablePassword(seed: Int): String {
    var randomPassword = ""
    // write your code here
    val randomRange = MIN..MAX
    val randoms = Random(seed)
    for (i in ONE..TEN) {
        randomPassword += randoms.nextInt(randomRange).toChar()
    }
    return randomPassword
}