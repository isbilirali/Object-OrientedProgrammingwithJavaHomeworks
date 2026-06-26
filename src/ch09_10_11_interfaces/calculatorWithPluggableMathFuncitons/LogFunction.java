package ch09_10_11_interfaces.calculatorWithPluggableMathFuncitons;

public class LogFunction implements SingleArgMathFunction {
    private static String name = "Log";

    public String getName() {
        return name;
    }

    public double calculate(double arg) {
        return Math.log(arg);
    }
}

