import kotlin.math.max

class MergeOverLappingIntervals {

    /**
     *   Write a function that takes in a non-empty array of arbitrary intervals,
     *   merges any overlapping intervals, and returns the new intervals in no
     *   particular order.
     *
     *   input = [[1, 2], [3, 5], [4, 7], [6, 8], [9, 10]]
     *   output =  [[1, 2], [3, 8], [9, 10]]
     *
     *   O(nlogn)
     *   0(n)
     */
    fun mergeOverLappingIntervals(intervals: List<List<Int>>): List<List<Int>> {
        if (intervals.isNullOrEmpty()) return emptyList()
        var sortedIntervals = intervals.toMutableList().sortedWith(Comparator<List<Int>> { a, b -> a[0].compareTo(b[0]) })
        sortedIntervals = sortedIntervals.map { it.toMutableList() }

        val mergedIntervals = mutableListOf<MutableList<Int>>()
        var currentInterval = sortedIntervals[0]
        mergedIntervals.add(currentInterval)

        for (nextInterval in sortedIntervals) {
            val (currentIntervalStart, currentIntervalEnd) = currentInterval
            val (nextIntervalStart, nextIntervalEnd) = nextInterval

            if (currentIntervalEnd >= nextIntervalStart) {
                currentInterval[1] = max(currentIntervalEnd, nextIntervalEnd)
            } else {
                currentInterval = nextInterval.toMutableList()
                mergedIntervals.add(currentInterval)
            }
        }

        return mergedIntervals
    }
}