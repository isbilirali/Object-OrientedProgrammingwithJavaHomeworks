package ch09_10_11_interfaces.calculatorWithPluggableMathFuncitons;

public class CosFunction implements SingleArgMathFunction {

    private static String name = "Cos";

    public String getName() {
        return name;
    }

    public double calculate(double arg) {
        return Math.cos(arg);
    }
}

