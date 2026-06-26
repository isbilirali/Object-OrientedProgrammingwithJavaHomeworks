package ch09_10_11_interfaces.calculatorWithPluggableMathFuncitons;

public class SinFunction implements SingleArgMathFunction {

    private static String name = "Sin";

    public String getName() {
        return name;
    }

    public double calculate(double arg) {
        return Math.sin(arg);
    }
}

