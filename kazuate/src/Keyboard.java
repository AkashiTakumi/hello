import java.util.Scanner;

public class Keyboard {
    public int inputNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("数を入力");
        int number = scanner.nextInt();
        if (number < 10 || 100 <= number) {
            System.out.println("もう一度二桁で数を入力してください");
            return inputNumber();
        } else {
            return number;
        }

        //return number;
    }
}
