package Task1;

import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        CollectionOfRandomNumbers collectionOfRandomNumbers = new CollectionOfRandomNumbers();

        List<Integer> collection = collectionOfRandomNumbers.setOfRandomNumbers();
        System.out.println(collection);

        List<Integer> collectionOfEvenNumbers = collection.stream()
                .filter(it -> it % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collectionOfEvenNumbers);
    }
}
