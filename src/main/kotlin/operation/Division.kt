package org.aansari.operation

class Division: IOperation {
    override fun performOperation(operand1: Double, operand2: Double): Double {
        if (operand2 == 0.0) {
            throw IllegalArgumentException("Operand2 (divisor) must be non-zero")
        }
        return operand1 / operand2
    }
}
