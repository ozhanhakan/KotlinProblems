fun main() {
    // write your code here
    val numbersLength = readln().toInt()
    var sequenceLength = 0
    var oldNumber = readln().toInt()
    sequenceLength++
    var longestSequence = sequenceLength

    for (i in 2..numbersLength) {
        val newNumber = readln().toInt()
        if (newNumber >= oldNumber) {
            sequenceLength++
            if (sequenceLength >= longestSequence) longestSequence = sequenceLength

        } else {
            if (sequenceLength >= longestSequence) longestSequence = sequenceLength
            sequenceLength = 1
        }
        oldNumber = newNumber
    }
    println(longestSequence)
}