const val HIGH_LEVEL = 3
const val MEDIUM_LEVEL = 2
const val LOW_LEVEL = 1

enum class DangerLevel(val num: Int) {
    HIGH(HIGH_LEVEL),
    MEDIUM(MEDIUM_LEVEL),
    LOW(LOW_LEVEL);

    fun getLevel(): Int {
        return this.num
    }
}

fun main() {
    val high = DangerLevel.HIGH
    val medium = DangerLevel.MEDIUM
    println(high.getLevel() > medium.getLevel())
}
