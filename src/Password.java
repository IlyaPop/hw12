import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = input.nextLine();

        if (password.length() > 8) {
            System.out.println("Пароль должен содержать менее 8 символов");
        } else if (!password.matches("[a-zA-Z0-9]+")) {
            System.out.println("Пароль должен содержать только строчные, прописные буквы и цифры");
        } else {
            System.out.println("Пароль подходит");
        }
    }
}