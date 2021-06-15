public class App {
    public static void main(String[] args) throws Exception {
        Comparison comparison = new Comparison();
        Keyboard keyboard = new Keyboard();
        int count = 0;
        int ans = 72;
        while (count < 5) {
            int number = keyboard.inputNumber();
            if (comparison.game(number, ans) == 0) {
                System.out.println("正解！すごいねえ");
                break;
            } else if (comparison.game(number, ans) == 1){
                System.out.println("ちっさいし20以上離れてるよ");
                if (count == 4) {
                    System.out.println("数当て失敗...");
                    break;
                }
            } else if (comparison.game(number, ans) == 2){
                System.out.println("小さいよ");
                if (count == 4) {
                    System.out.println("数当て失敗...");
                    break;
                }
            } else if (comparison.game(number, ans) == 3){
                System.out.println("おっきいし20以上離れてるよ");
                if (count == 4) {
                    System.out.println("数当て失敗...");
                    break;
                }
            } else if (comparison.game(number, ans) == 4){
                System.out.println("おっきいよ");
                if (count == 4) {
                    System.out.println("数当て失敗...");
                    break;
                }
            }
            count += 1;
        }
    }
}
