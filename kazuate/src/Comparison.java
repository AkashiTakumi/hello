public class Comparison {
    public int game(int number, int ans) {
        if (number < ans) {
            if (ans - number >= 20) {
                return 1;
            } else {
                return 2;
            }
        } else if (number > ans){
            if (number - ans >= 20){
                return 3;
            } else {
                return 4;
            }
        } else {
            return 0;
        }
    }
}
