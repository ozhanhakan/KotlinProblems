class Player(val id: Int, val name: String, val hp: Int) {
    companion object {
        var id = 0
        fun create(name: String): Player {
            val hp = 100
            return Player(++id, name, hp)
        }
    }
}
/*

fun main() {
    val a1 = Player.create("Hakan")
    val a2 = Player.create("Hakan2")
    val a3 = Player.create("Hakan3")
    val a4 = Player.create("Hakan4")
    val a5 = Player.create("Hakan5")
    println(a1)
    println(a1.id)
    println(a1.hp)
    println(a1.name)
    println(a2.id)
    println(a3.id)
    println(a4.id)
    println(a5.id)
}*/
