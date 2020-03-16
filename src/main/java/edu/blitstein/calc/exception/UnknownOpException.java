package edu.blitstein.calc.exception;

public class UnknownOpException extends Throwable {
    public UnknownOpException(char op) {
        super("The operatoin " + op + " is unknown.");
    }
}
