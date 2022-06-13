// implement your function here
/*fun main() {
countItem(listOf<Int>(1,2,3,3,3,3,3,3,4,5,5,5),3)
countItem(listOf<String>("sen","sen","a","a"),"sen")
}*/
fun <T> countItem(list: List<T>, item: T): Int {
    var times = 0
    for (i in list) {
        if (i == item) times++
    }
    return times
}