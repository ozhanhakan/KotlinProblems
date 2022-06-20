val notPredicate: (Char) -> Boolean = { !originalPredicate(it) }
/*
https://stackoverflow.com/questions/63225572/lambda-expressions-not-predicate
    val notPredicate: (Char) -> Boolean = { char ->
    val booleanValue = originalPredicate(char)
    return@notPredicate !booleanValue
    // val notPredicate: (Char) -> Boolean = { !originalPredicate(it) }
}*/
