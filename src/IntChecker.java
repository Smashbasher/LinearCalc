public class IntChecker {
    public static boolean check(String[] values) throws Exception {
        int intValue = 0;
        if (intValue != Integer.parseInt(values[0])) {
            throw new Exception("Вводимое выражение должно начинаться со строки");
        }else return true;
    }
}