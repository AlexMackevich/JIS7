public class MathOperationsDemo {
//**********@Checked***************//
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
//Разделяй пробелами выражения с арифметическими знаками включая конкатенацию. Тогда будет читабельней
        int w = a + b;
        int x = a - b;
        int y = a * b;
        float z = a / b;
        System.out.println("Математические операции, где а = 10, b = 5");
        System.out.println("Сложение: " + w);
        System.out.println("Вычитание: " + x);
        System.out.println("Умножение: " + y);
        System.out.println("Деление: " + z);
    }
}
