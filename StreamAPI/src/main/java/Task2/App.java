package Task2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        var collectionOfString = new CollectionOfString();

        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("First string");
        stringArrayList.add("Java are awesome");
        stringArrayList.add("Who add streams in Java - them are fcking genius");
        stringArrayList.add("Next lesson will be about string");
        stringArrayList.add("");
        stringArrayList.add("Something about lambdas");

        String i = collectionOfString.method("string");

        stringArrayList.stream()
                .filter(it -> it.startsWith(i) || it.endsWith(i))
                .forEach(System.out::println);
    }
}
