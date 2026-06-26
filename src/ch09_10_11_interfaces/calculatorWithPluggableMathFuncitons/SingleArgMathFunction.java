package ch09_10_11_interfaces.calculatorWithPluggableMathFuncitons;

public interface SingleArgMathFunction extends MathFunction {

    public double calculate(double arg);
}
