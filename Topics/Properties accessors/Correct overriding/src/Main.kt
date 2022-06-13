import kotlin.reflect.typeOf

fun main() {
    val smartOne = Smartphone("Ericsong")
    smartOne.price = -24
    val smartTwo = Smartphone("iNokhe")
    print(smartTwo.price - smartOne.price)
    println("**************")
//    val obj1= MyClass("hyperskill")
    val obj1: MyClass<String> = MyClass<String>("aaaa")
    println(obj1.item)
    println(typeOf<Boolean>())
}

class Smartphone(val name: String) {
    var price: Int = -5
        get() = name.length - field
}

class MyClass<T>(t: T) {

    val item = t  // A field of "some type"

}