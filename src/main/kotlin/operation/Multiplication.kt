package org.aansari.operation

class Multiplication: IOperation {
    override fun performOperation(operand1: Double, operand2: Double): Double {
        return operand1 * operand2
    }
}
