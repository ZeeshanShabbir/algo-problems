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
}