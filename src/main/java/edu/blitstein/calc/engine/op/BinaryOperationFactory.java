package edu.blitstein.calc.engine.op;

import edu.blitstein.calc.exception.UnknownOpException;

public class BinaryOperationFactory {
    public static BinaryOperation createOperation(final char symbol) throws UnknownOpException {
        final BinaryOperation op;
        switch (symbol) {
            case '+' :
                op = BinaryOperation.PLUS;
                break;
            case '*' :
                op = BinaryOperation.TIMES;
                break;
            case '-' :
                op = BinaryOperation.MINUS;
                break;
            case '/' :
                op = BinaryOperation.DIVIDE;
                break;
            default:
                throw new UnknownOpException(symbol);
        }
        return op;
    }
}
