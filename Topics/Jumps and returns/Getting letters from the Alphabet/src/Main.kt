fun main() {
    /*val letter = readln()
    for (i in 'a'..'z') {
        if (i.toString() == letter) return
        print(i)
    }*/
    // Break keyword with label
    for (i in 1..4) {
        loop@ for (j in 1..3) {
            for (k in 1..2) {
                if (i == 2 || j == 3 || k == 2) break@loop
                print("$k")
            }
        }
    }
}