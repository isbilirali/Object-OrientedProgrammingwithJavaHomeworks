package ch12_13_exceptionManagement.InvalidInputException;

public class StringParser {
    public static int parser(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Sayısal bir değer bekleniyordu, ancak '" + input + "' alındı " , e);
        }
    }
}
