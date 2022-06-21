import java.util.Scanner;

public class Input {
    public static String[] read() throws Exception {
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        String[] values = input.split(" ");
        if (values.length > 3) {
            throw new Exception("Больше двух аргументов");
        }
        return values;
    }
}
