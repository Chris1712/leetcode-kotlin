package personal.chris.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals

class `62UniquePathsTest` {

    val target = `62UniquePaths`()

    @Test
    fun `3x7 grid`() {
        val result = target.uniquePaths(3, 7)

        assertEquals(28, result)
    }


    @Test
    fun `7x3 grid`() {
        val result = target.uniquePaths(7, 3)

        assertEquals(28, result)
    }

    @Test
    fun `3x2 grid`() {
        val result = target.uniquePaths(3, 2)

        assertEquals(3, result)
    }

    @Test
    fun `1x1 grid`() {
        val result = target.uniquePaths(1, 1)

        assertEquals(1, result)
    }

    @Test
    fun `2x1 grid`() {
        val result = target.uniquePaths(2, 1)

        assertEquals(1, result)
    }

    @Test
    fun `1x2 grid`() {
        val result = target.uniquePaths(1, 2)

        assertEquals(1, result)
    }

    @Test
    fun `1x5 grid`() {
        val result = target.uniquePaths(1, 5)

        assertEquals(1, result)
    }

    @Test
    fun `2x2 grid`() {
        val result = target.uniquePaths(2, 2)

        assertEquals(2, result)
    }

    @Test
    fun `10x10 grid`() {
        val result = target.uniquePaths(10, 10)

        assertEquals(48620, result)
    }

    @Test
    fun `16*16 grid`() {
        val result = target.uniquePaths(16, 16)

        assertEquals(155117520, result)
    }

    @Test
    fun `23x12 grid`() {
        val result = target.uniquePaths(23, 12)

        assertEquals(193536720, result)
    }

    @Test
    fun `51x9 grid`() {
        val result = target.uniquePaths(51, 9)

        assertEquals(1916797311, result)
    }

}
