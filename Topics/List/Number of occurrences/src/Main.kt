fun solution(strings: List<String>, str: String): Int {
    var timesOfOccur = 0
    for (s in strings) {
        if (s == str) timesOfOccur++
    }
    return timesOfOccur
}