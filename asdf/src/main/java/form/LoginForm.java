package form;

import lombok.Data;

@Data
public class LoginForm {
    String id;
    String password;

    public LoginForm() {
        super();
    }
}
