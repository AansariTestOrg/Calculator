import org.aansari.Calculator
import org.aansari.Operator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTest {
    private val testCalculator: Calculator = Calculator()

    @Test
    fun `Addition operation successfully adds two numbers`() {
        val operand1 = 1.0
        val operand2 = 2.0
        val expectedResult = 3.0

        val actualResult = testCalculator.calculate(operand1, operand2, Operator.ADDITION)

        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Subtraction operation successfully subtracts second number from first`() {
        val operand1 = 3.0
        val operand2 = 2.0
        val expectedResult = 1.0

        val actualResult = testCalculator.calculate(operand1, operand2, Operator.SUBTRACTION)

        assertEquals(expectedResult, actualResult)
    }
}
