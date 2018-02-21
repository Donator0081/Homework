package lesson17;

/**
 * Created by Student on 21.02.2018.
 */
public class AuthenticDemo {
    public static void main(String[] args) {
        System.out.println(isAuthenticated("login1", "password1", "password1"));
        System.out.println(isAuthenticated("loginawffwafawfwafawsdvsdvvdsvds", "password1", "password1"));
        System.out.println(isAuthenticated("login1", "password1fwafwafwafaw", "password1awf"));
        System.out.println("Конец");

    }

    public static boolean isAuthenticated(String login, String password, String confPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Слишком длинный логин");
            }
            if (password.length() > 20 || !password.equals(confPassword)) {
                throw new WrongPasswordException("Неверный пароль");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.printf("Логин %s, пароль %s, подтверждение пароля %s%n", login, password, confPassword);
        }
        return true;
    }
}
