package edu.blitstein.calc.engine.op;

import edu.blitstein.calc.exception.DivideByZeroException;

public enum BinaryOperation {
    PLUS("+") {
          public double apply(double x, double y) {
            return x + y;
          }
        },
    MINUS("-") {
          public double apply(double x, double y) {
            return x - y;
          }
        },
    TIMES("*") {
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        public double apply(double x, double y) {
           if ((-precision < y) && (y < precision)) {
                  throw new DivideByZeroException();
              }
            return x / y;
          }
        };

    private final static double precision = 0.001;
    private final String symbol;

    BinaryOperation(String symbol) {
      this.symbol = symbol;
    }

    @Override
    public String toString() {
      return symbol;
    }

    abstract public double apply(double x, double y) throws ArithmeticException;
}
