fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")


    //[[1, 2], [3, 5], [4, 7], [6, 8], [9, 10]]
    val input = listOf<List<Int>>(
        listOf(9, 10),
        listOf(1, 2),
        listOf(3, 5),
        listOf(4, 7),
        listOf(6, 8),
    )
    // [[1, 2], [3, 8], [9, 10]]

    val mergeOverLappingIntervals = MergeOverLappingIntervals()
    val outPut = mergeOverLappingIntervals.mergeOverLappingIntervals(emptyList())
    println(outPut)

    val tiles1 = "11133555"
    val tiles2 = "111333555"
    val tiles3 = "00000111"
    val tiles4 = "13233121"
    val tiles5 = "11223344555"
    val tiles6 = "99999999"
    val tiles7 = "999999999"
    val tiles8 = "9"
    val tiles9 = "99"
    val tiles10 = "000022"
    val tiles11 = "888889"
    val tiles12 = "889"
    val tiles13 = "88888844"
    val tiles14 = "77777777777777"
    val tiles15 = "1111111"
    val tiles16 = "1111122222"

    println(CompleteHand().complete(tiles1))
}