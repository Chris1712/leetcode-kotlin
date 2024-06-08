package personal.chris.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class `63UniquePaths2Test` {

    val target = `63UniquePaths2`()

    @Test
    fun `1x1 obstacle grid`() {
        val obstacleGrid: Array<IntArray> = arrayOf(intArrayOf(1))

        val result = target.uniquePathsWithObstacles(obstacleGrid)

        assertEquals(0, result)
    }

    @Test
    fun `1x1 clear grid`() {
        val obstacleGrid: Array<IntArray> = arrayOf(intArrayOf(0))

        val result = target.uniquePathsWithObstacles(obstacleGrid)

        assertEquals(1, result)
    }

    @Test
    fun `10x10 clear grid`() {
        val obstacleGrid: Array<IntArray> = Array(10) {
            IntArray(10) { 0 }
        }

        val result = target.uniquePathsWithObstacles(obstacleGrid)

        assertEquals(48620, result)
    }

    @Test
    fun `3x3 grid`() {
        val obstacleGrid: Array<IntArray> = arrayOf(intArrayOf(0,0,0), intArrayOf(0,1,0), intArrayOf(0,0,0))

        val result = target.uniquePathsWithObstacles(obstacleGrid)

        assertEquals(2, result)
    }

    @Test
    fun `4x4 grid with 2 paths`() {
        val obstacleGrid: Array<IntArray> = arrayOf(
            intArrayOf(0,0,0,0),
            intArrayOf(0,1,1,0),
            intArrayOf(0,1,1,0),
            intArrayOf(0,0,0,0)
        )

        val result = target.uniquePathsWithObstacles(obstacleGrid)

        assertEquals(2, result)
    }

    @Test
    fun `4x4 grid with 1 path`() {
        val obstacleGrid: Array<IntArray> = arrayOf(
            intArrayOf(0,0,0,0),
            intArrayOf(0,1,1,0),
            intArrayOf(0,1,1,1),
            intArrayOf(0,0,0,0)
        )

        val result = target.uniquePathsWithObstacles(obstacleGrid)

        assertEquals(1, result)
    }

    @Test
    fun `4x4 grid with 0 paths`() {
        val obstacleGrid: Array<IntArray> = arrayOf(
            intArrayOf(0,0,0,0),
            intArrayOf(0,1,1,0),
            intArrayOf(0,1,1,1),
            intArrayOf(1,0,0,0)
        )

        val result = target.uniquePathsWithObstacles(obstacleGrid)

        assertEquals(0, result)
    }
}
