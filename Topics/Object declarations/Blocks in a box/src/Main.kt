class Block(val color: String) {
    object BlockProperties {
        var length = 6
        var width = 4
        fun blocksInBox(length: Int, width: Int): Int {
            // var countLength = BlockProperties.length / length
            // var countWidth = BlockProperties.width / width
            // return minOf(countWidth, countLength)
            return (length / BlockProperties.length) * (width / BlockProperties.width)
        }
    }
}