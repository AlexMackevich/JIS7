package FirstTaskOfStreamFromAtremiy;

import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

    var collectionOfRandomNumbers = new CollectionOfRandomNumbers();

        var collection = collectionOfRandomNumbers.setOfRandomNumbers();
        System.out.println(collection);

        var collectionOfEvenNumbers = collection.stream()
                .filter(it -> it % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collectionOfEvenNumbers);
    }
}
