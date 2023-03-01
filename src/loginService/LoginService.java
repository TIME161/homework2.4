package loginService;

import exceptions.WrongLoginException;

public class LoginService {
    public static void loginCheck(String input) {
        final String patternLogin = "^[\\w]*$";
        try {
            if (input.matches(patternLogin) && input.length() <= 20 && input.length() > 0) {
                System.out.println("Логин подходит");
            } else  {
                throw new WrongLoginException();}
        } catch (WrongLoginException e) {
            System.out.println("Логин не подходит");
            System.out.println("Логин должен содержать a-z A-z _ и быть не длиннее 20 символов");
        }
    }
}
