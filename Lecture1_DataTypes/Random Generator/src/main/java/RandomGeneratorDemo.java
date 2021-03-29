public class RandomGeneratorDemo {
//**********@Checked***************//
    public static void main(String[] args) {

        double a = Math.random();
        double b = Math.random();
        double c = Math.random();

        double x = a + b + c;

        System.out.println("Первое сгенерированное число: " + a);
        System.out.println("Первое сгенерированное число: " + b);
        System.out.println("Первое сгенерированное число: " + c);
        System.out.println("Сумма чисел: " + x);
    }
}
