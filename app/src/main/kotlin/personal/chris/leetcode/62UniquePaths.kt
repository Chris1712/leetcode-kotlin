package personal.chris.leetcode

class `62UniquePaths` {

    fun uniquePaths(m: Int, n: Int): Int {
        // I had of two ways of thinking of this.
        // The first is combinatorics, where the answer is (m+n-2) choose (m-1)
        //      (thinking of moves across as buckets and moves down as balls)
        // The second way is recursive and easier to implement without overflowing an int
        return uniquePathsRecursive(m, n, mutableMapOf("1,1" to 1))
    }

    fun uniquePathsRecursive(m: Int, n: Int, map: MutableMap<String,Int>): Int {
        if (map.containsKey("$m,$n")) {
            return map["$m,$n"]!!
        } else if (map.containsKey("$n,$m")) { // symmetry
            return map["$n,$m"]!!
        } else if (m == 1 || n == 1) {
            map["$m,$n"] = 1
            return 1
        } else {
            val result = uniquePathsRecursive(m-1, n, map) + uniquePathsRecursive(m, n-1, map)
            map["$m,$n"] = result
            return result
        }
    }
}
