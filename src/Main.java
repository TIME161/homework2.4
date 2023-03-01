import loginService.LoginService;
import loginService.PasswordService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите логин");
        String loginInput = input.readLine();
        LoginService.loginCheck(loginInput);
        System.out.println("Введите пароль");
        String passwordInput = input.readLine();
        System.out.println("Подтвердите пароль");
        String confirmPasswordInput = input.readLine();
        PasswordService.passCheck(passwordInput, confirmPasswordInput);
    }
}