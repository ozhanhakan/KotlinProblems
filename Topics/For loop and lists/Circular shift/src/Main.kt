fun main() {
    val size = readln().toInt()
    val mutList: MutableList<Int> = mutableListOf()
    for (i in 0 until size) {
        mutList.add(readln().toInt())
    }
    repeat(1) {
        /*val lastNum = mutList[mutList.lastIndex]
        mutList.removeAt(mutList.lastIndex)
        mutList.add(0, lastNum)*/
        rotateRight(mutList)
    }
    println(mutList.joinToString(" "))
}

fun rotateRight(list: MutableList<Int>): MutableList<Int> {
    val lastNum = list[list.lastIndex]
    list.removeAt(list.lastIndex)
    list.add(0, lastNum)
    return list
}
