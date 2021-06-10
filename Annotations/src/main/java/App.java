public class App {

    public static void main(String[] args) throws Exception {

        RandomIntObject randomIntObject = new RandomIntObject();

        var generateValue = new GenerateIntValueAnnotationProcessor();
        generateValue.analyze(randomIntObject);
    }
}