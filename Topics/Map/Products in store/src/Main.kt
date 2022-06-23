fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    var listTotalPrice = 0
    for (shop in shoppingList) {
        if (priceList.containsKey(shop)) listTotalPrice += priceList[shop]!!
    }
    return listTotalPrice
}
/*

fun main() {
    println(bill(mapOf("Cola" to 500, "Apple" to 1500, "Banana" to 300), mutableListOf("Cola", "Apple")))
    println(bill(mapOf("Pen" to 1, "Ananas" to 2, "Sheet" to 0), mutableListOf("Cola", "Apple")))
    println(bill(mapOf("Sprite" to 150, "Lays" to 200,"Milk" to 600,"Snickers" to 100), mutableListOf("Sprite","Lays", "Coffee")))
}*/
