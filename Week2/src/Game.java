import java.util.Scanner;

public class Game {
    private int value;

    public Game(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎来到猜字游戏");
        Game g = new Game(100);
        do {
            int temp = g.guess(in.nextInt());
            if (temp == 0) {
                System.out.println("恭喜你猜对了!");
                break;
            } else if (temp > 0) System.out.print("猜的数字有点大");
            else System.out.print("猜的数字有点小");
            System.out.println(",再来一遍吧!");
        } while (true);
    }

    public int guess(int value) {
        return value - this.value;
    }
}