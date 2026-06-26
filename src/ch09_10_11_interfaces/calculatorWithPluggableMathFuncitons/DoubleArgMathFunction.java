package ch09_10_11_interfaces.calculatorWithPluggableMathFuncitons;

public interface DoubleArgMathFunction extends MathFunction {

    public double calculate(double arg1, double arg2);
}

