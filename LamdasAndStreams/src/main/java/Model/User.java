package Model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
