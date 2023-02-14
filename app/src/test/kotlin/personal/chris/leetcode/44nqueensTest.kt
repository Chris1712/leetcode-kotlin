package personal.chris.leetcode

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull


class `44NQueensTest` {

    val target = `44NQueens`()

    @Test fun `intSolutionsToStrings works`() {
        val intSolution = listOf(1, 3, 0 ,2)

        val stringSolution = target.intSolutionToStrings(intSolution)

        assertEquals(4, stringSolution.size)
        assertEquals(".Q..", stringSolution[0])
        assertEquals("...Q", stringSolution[1])
        assertEquals("Q...", stringSolution[2])
        assertEquals("..Q.", stringSolution[3])
    }

    @Test fun `n=4 has 2 solutions`() {
        val solution = target.solveNQueens(4)

        assertNotNull(solution)
        assertEquals(2, solution.size)
    }

    @Test fun `n=1 has 1 solution`() {
        val solution = target.solveNQueens(1)

        assertNotNull(solution)
        assertEquals(1, solution.size)
        assertEquals(1, solution[0].size)
        assertEquals("Q", solution[0][0])
    }

}
