import org.apache.maven.surefire.shade.org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayExample2 {

    public static void main(String[] args) {

        System.out.println("\nВведите содержимое массива:\n");
        int [] array1 = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++){
            array1[i] = scanner.nextInt();
        }

        System.out.println("\nПроверка заполненности массива\n");

        for (int mas = 0; mas < array1.length; mas++) {
            if (ArrayUtils.contains(array1, 0)) {
                System.out.println("\nМассив не заполнен\n");
            } else array1 = Arrays.copyOf(array1, array1.length * 3 / 2);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(array1.length);

        System.out.println("\n Добавление новых элементов\n");

        for (int ind = 5; ind < array1.length; ind++){
            array1[ind] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array1));
    }
}
