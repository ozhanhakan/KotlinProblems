// TODO: provide three functions here
fun zero(x:Int): Int = 0
fun half(x: Int): Int = x / 2
fun identity(x: Int): Int = x

fun generate(functionName: String): (Int) -> Int {
    // TODO: provide implementation here
    if(functionName == "half"){
        return ::half
    } else if (functionName == "identity"){
        return ::identity
    } else{
        return ::zero
    }
}