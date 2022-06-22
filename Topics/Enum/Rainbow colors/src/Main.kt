enum class Rainbow(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet");

    companion object {
        fun isRainbow(color: String): Boolean {
            for (enum in Rainbow.values()) {
                if (color.uppercase() == enum.name) return true
            }
            return false
        }
    }
}

fun main() {
    val input = readln()
    println(Rainbow.isRainbow(input))
}