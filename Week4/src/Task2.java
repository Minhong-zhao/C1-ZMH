import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(findstr(s));
    }

    private static int findstr(String s) {
        int ans, count = 0;
        for (int i = 0; i < s.length(); i++) {
            ans = s.indexOf(s.charAt(i), i + 1);
            if (ans == -1) {
                count = i;
                break;
            }
        }
        return count;
    }
}