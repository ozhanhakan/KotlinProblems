fun solution(first: List<Int>, second: List<Int>): MutableList<Int> {
    val addedList = first.toMutableList()
    addedList.addAll(second)
    return addedList
}