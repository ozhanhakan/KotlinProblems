val lambda: (Long, Long) -> Long = { a: Long, b: Long ->
    var multiple: Long = 1L
    for (x in a..b) multiple *= x
    multiple.toLong()
}