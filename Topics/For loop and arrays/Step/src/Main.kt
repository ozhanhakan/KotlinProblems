// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    // put your code here
    val metin = arrayOf("Practice", "makes", "perfect")
    val number = arrayOf(1, 2, 3)
    val e2d = arrayOf(
        metin,
        number
    )
    println(e2d.size)
    for (i in e2d.indices) {
        for (j in e2d.first().indices) print("${e2d[i][j]}\t")
        println()
    }
}
