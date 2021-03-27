import java.util.Arrays;
import java.util.Collections;
import org.apache.commons.lang3.ArrayUtils;


public class ArrayExample {

    public static void main(String[] args) {

        System.out.println("\nСлучайно сгенерированный массив:\n");
        Integer[] array1 = new Integer[5];
        for (int i = 0; i<array1.length; i++){
        array1[i] = (int)(Math.random()*100);
        System.out.println(array1[i]);
        }
        System.out.println("\nСортировка по возрастанию: \n");

        Arrays.sort(array1);
        for (int i = 0; i<array1.length; i++){
        System.out.println(array1[i]);
        }

        Integer[] array2 = Arrays.copyOf(array1, array1.length);
        System.out.println("\nСкопированный массив, зеркально отраженный: \n");
        Arrays.sort(array2, Collections.reverseOrder());
        for (int i = 0; i<array2.length; i++){
        System.out.println(array2[i]);
        }

        System.out.println("\nОбщий массив: \n");
        Integer[] array3 = ArrayUtils.addAll(array1,array2);
        System.out.println(Arrays.toString(array3));
    }
}
