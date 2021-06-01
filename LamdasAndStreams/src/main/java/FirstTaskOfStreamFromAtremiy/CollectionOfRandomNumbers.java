package FirstTaskOfStreamFromAtremiy;

import java.util.ArrayList;
import java.util.List;

public class CollectionOfRandomNumbers {

    public List setOfRandomNumbers () {

        List<Integer> collectionOfRandomNumbers = new ArrayList<>();
        for (int a = 0; a < 15; a++){
          collectionOfRandomNumbers.add((int) (Math.random()*100));
        }
        return collectionOfRandomNumbers;
    }
}
