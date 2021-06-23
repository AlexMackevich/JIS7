package Task6.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String nickName;
    private long id;
    private String mail;
    private String password;
    private StatusOfUser statusOfUser;
    private boolean isActive;

    public enum StatusOfUser {
        GUEST,
        USER,
        VIP_USER
    }
}
