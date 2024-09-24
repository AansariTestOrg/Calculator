package org.aansari.operation

import kotlin.math.pow

class Exponentiation: IOperation {
    override fun performOperation(operand1: Double, operand2: Double): Double {
        return operand1.pow(operand2)
    }
}
