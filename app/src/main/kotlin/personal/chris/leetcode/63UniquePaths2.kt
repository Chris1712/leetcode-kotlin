package personal.chris.leetcode

class `63UniquePaths2` {

    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        // Similar to 62, we can recurse, we just need to be a little smarter and check if we're blocked
        // Moving through the outer array is up down, IE our y coord
        // Moving through the inner arrays is left right, IE our x coord

        // So we have:
        val m = obstacleGrid.size - 1 // The number of down motions
        val n = obstacleGrid[0].size - 1 // The number of right motions

        // Make sure we don't have a degenerate grid with entrance or exit blocked
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m][n] == 1) {
            return 0
        }
        return uniquePaths(obstacleGrid, m, n, mutableMapOf("0,0" to 1))
    }

    /**
     * Recursive function to calculate the number of unique paths through a grid
     * @param obstacleGrid The grid of obstacles
     * @param m The number of down motions remaining
     * @param n The number of right motions remaining
     * @param map A map of already calculated values
     */
    fun uniquePaths(obstacleGrid: Array<IntArray>, m: Int, n: Int, map: MutableMap<String, Int>): Int {
        // Similar to 62, we can recurse, we just need to be a little smarter and check if we're blocked
        if (map.containsKey("$m,$n")) {
            return map["$m,$n"]!!
        }

        val currentY = obstacleGrid.size - m
        val currentX = obstacleGrid[0].size - n

        var possibleMoves = 0;
        if (m > 0 && obstacleGrid[currentY][currentX-1] == 0) {
            // We can move down
            possibleMoves += uniquePaths(obstacleGrid, m-1, n, map)
        }
        if (n > 0 && obstacleGrid[currentY-1][currentX] == 0) {
            // We can move right
            possibleMoves += uniquePaths(obstacleGrid, m, n-1, map)
        }
        map["$m,$n"] = possibleMoves
        return possibleMoves
    }

}
