import java.util.Scanner;

public class Input {
    private static String extractValue(String quotedValue){
        return quotedValue.replaceAll("\"", "");
    }
    public static String[] read() throws Exception {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        String[] values = input.split(" ");
        if (values.length > 3) {
            throw new Exception("Больше двух аргументов");
        }
        boolean isInt = IntChecker.isIntValue(values[0]);
        if (isInt == true){
            throw new Exception("Операции, начинаемые с чисел недопустимы");
        }
        boolean inQuotes = StringQuotes.isValid(values);
        if (inQuotes == false){
            throw new Exception("Допускаются только строки в кавычках и целые числа");
        }
        values[0] = Input.extractValue(values[0]);
        values[2] = Input.extractValue(values[2]);
        return values;
    }

}
