package ch09_10_11_interfaces.calculatorWithPluggableMathFuncitons;

public interface Calculator {

    public double doCalculation(String functionName, double ... arg);

    public void addFunction(MathFunction function);

    public void listMathFunction();
}
