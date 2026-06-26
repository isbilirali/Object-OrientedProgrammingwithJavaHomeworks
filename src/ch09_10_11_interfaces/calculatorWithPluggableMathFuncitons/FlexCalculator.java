package ch09_10_11_interfaces.calculatorWithPluggableMathFuncitons;

public class FlexCalculator implements Calculator {
    private int functionCount;
    private int currentCount = 0;

    private MathFunction[] functions;
    private double argument;

    public FlexCalculator(int functionCount) {
        this.functionCount = functionCount;
        functions = new MathFunction[functionCount];
    }

    @Override
    public void addFunction(MathFunction function) {
        functions[currentCount] = function;
        currentCount++;

        if(currentCount == functionCount)
            System.out.println("All functions are added!");
    }

    @Override
    public void listMathFunction() {
        System.out.println("Available Functions:");
        for (MathFunction function : functions)
            System.out.println(function.getName());
    }

    @Override
    public double doCalculation(String functionName, double ... arg) {
        double result = 0.0;
        boolean isFunctionFound = false;
        for (MathFunction function : functions) {
            if (functionName.equalsIgnoreCase(function.getName())) {

                if(function instanceof SingleArgMathFunction) {
                    result = ((SingleArgMathFunction)function).calculate(arg[0]);  //goooooooood ex for downcasting!
                    isFunctionFound = true;
                }

                if(function instanceof DoubleArgMathFunction) {
                    result = ((DoubleArgMathFunction) function).calculate(arg[0], arg[1]); //goooooooood ex for downcasting!
                    isFunctionFound = true;
                }
            }
        }
        if(!isFunctionFound)
            System.out.println("No such function found!");

        return result;
    }

}
