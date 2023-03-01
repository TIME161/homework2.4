package loginService;
import exceptions.IncorrectPasswordException;
import exceptions.WrongPasswordException;

public class PasswordService {

        public static void passCheck(String input, String input2) {
            final String patternLogin = "^[\\w]*$";
            try {
                if (input.matches(patternLogin) && input.length() <= 20 && input.length() > 0) {
                    System.out.println("Пароль подходит");
                } else {
                    throw new IncorrectPasswordException();
                }
                if (input.equals(input2)) {
                    System.out.println("Пароли совпадают");
                } else {
                    throw new WrongPasswordException();
                }
            } catch (IncorrectPasswordException e) {
                System.out.println("Пароль не подходит");
                System.out.println("Пароль должен содержать a-z A-z _ и быть не длиннее 20 символов");
            } catch (WrongPasswordException e) {
                System.out.println("Пароли не совпадают");
            }
        }
    }