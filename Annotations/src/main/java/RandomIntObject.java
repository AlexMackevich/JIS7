import lombok.Data;

@Data
public class RandomIntObject {
    @GenerateIntValue
    private int someRandomNumber;
}
