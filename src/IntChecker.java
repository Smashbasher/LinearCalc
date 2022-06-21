public class IntChecker {
    public static boolean check(String[] values) {
        int intValue = 0;
        if (intValue == Integer.parseInt(values[0])) {
            System.out.println("Вводимое выражение должно начинаться со строки");
        }else return false;
        return true;
    }
}