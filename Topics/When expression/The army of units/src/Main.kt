const val NO_ARMY = "no army"
const val FEW = "few"
const val SEVERAL = "several"
const val PACK = "pack"
const val LOTS = "lots"
const val HORDE = "horde"
const val THRONG = "throng"
const val SWARM = "swarm"
const val ZOUNDS = "zounds"
const val MORE_THAN_1000 = "legion"
fun main() {
    // write your code here
    println(
        when (readln().toInt()) {
            in Int.MIN_VALUE..0 -> NO_ARMY
            in 1..4 -> FEW
            in 5..9 -> SEVERAL
            in 10..19 -> PACK
            in 20..49 -> LOTS
            in 50..99 -> HORDE
            in 100..249 -> THRONG
            in 250..499 -> SWARM
            in 500..999 -> ZOUNDS
            else -> MORE_THAN_1000
        }
    )
    /* val input = readln().toInt()
     println(
         when {
             input < 1 -> NO_ARMY
             input in 1..4 -> FEW
             input in 5..9 -> SEVERAL
             input in 10..19 -> PACK
             input in 20..49 -> LOTS
             input in 50..99 -> HORDE
             input in 100..249 -> THRONG
             input in 250..499 -> SWARM
             input in 500..999 -> ZOUNDS
             else -> MORE_THAN_1000
         }
     )*/
}