package org.aansari

import org.aansari.operation.Addition
import org.aansari.operation.Division
import org.aansari.operation.Multiplication
import org.aansari.operation.Subtraction

class Calculator() {
    fun calculate(
        operand1: Double,
        operand2: Double,
        operator: Operator
    ): Double {
        when (operator) {
            Operator.ADDITION -> {
                val addition = Addition()
                return addition.performOperation(operand1, operand2)
            }
            Operator.SUBTRACTION -> {
                val subtraction = Subtraction()
                return subtraction.performOperation(operand1, operand2)
            }
            Operator.MULTIPLICATION -> {
                val multiplication = Multiplication()
                return multiplication.performOperation(operand1, operand2)
            }
            Operator.DIVISION -> {
                val division = Division()
                return division.performOperation(operand1, operand2)
            }
        }
    }
}

enum class Operator {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION
}
