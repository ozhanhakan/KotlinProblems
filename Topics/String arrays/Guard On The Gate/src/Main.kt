var counter = 3;
fun main() {
    /*var backFromTheWall = readLine()!!.split(',').map { it }.toTypedArray()
    val returnedWatchman = readLine()!!.toString()
    // do not touch the lines above
    // write your code here
    backFromTheWall += returnedWatchman
    println(backFromTheWall.joinToString())*/


        if(counter == 0) return
        counter = counter - 1
        main()
        print(0)

}