package personal.chris.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull


class `44NQueensTest` {

    @Test fun `intSolutionsToStrings works`() {
        val intSolution = listOf(1, 3, 0 ,2)

        val stringSolution = `44NQueens`.intSolutionToStrings(intSolution)

        assertEquals(4, stringSolution.size)
        assertEquals(".Q..", stringSolution[0])
        assertEquals("...Q", stringSolution[1])
        assertEquals("Q...", stringSolution[2])
        assertEquals("..Q.", stringSolution[3])
    }

    @Test fun `n=4 has 2 solutions`() {
        val solution = `44NQueens`.solveNQueens(4)

        assertNotNull(solution)
        assertEquals(2, solution.size)
    }

}
