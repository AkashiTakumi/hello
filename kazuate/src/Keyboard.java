import java.util.Scanner;

public class Keyboard {
    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("数を入力");
        int number = scanner.nextInt();

        return number;
    }
}
