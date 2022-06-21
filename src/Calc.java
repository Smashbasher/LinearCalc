public class Calc {
    public static String calculate(String wrd, String wrd1, String opr) throws Exception {
        int num1 = 0;
        String result = new String();
        switch (opr) {
            case "-":
                result = wrd.replace(wrd1, "");
                break;
            case "+":
                result = wrd + wrd1;
                break;
            case "*":
                num1 = Integer.parseInt(wrd1);
                for (int i = 0; i < num1; i++) {
                    result += wrd;
                }
                if (result.length() > 40) {
                    result = result.substring(0, 39) + "...";
                }
                break;
            case "/":
                num1 = Integer.parseInt(wrd1);
                int stringLength = Math.round(wrd.length() / num1);
                result = wrd.substring(0, stringLength);
                break;
            default:
                throw new Exception("Неверная операция");
        }
        return result;
    }
}
