public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите выражение типа: 'а'+'b', 'a'-'b', 'a'*x, 'a'/x");
        String[] values = Input.read();
        boolean goodValues = IntChecker.check(values);
        char opr = values[1].charAt(0);
        String result = Calc.calculate(values[0], values[1], opr);
        int resultLength = result.length();
        if (resultLength > 100){
            throw new Exception("Ввод строковых значений больше 10 символов и чисел больше 10 не допускается");
            
        } else System.out.println(result);
    }
}