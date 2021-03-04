import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("请输入:");
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(findpattern(s1, s2));
    }

    private static int findpattern(String s1, String s2) {
        int ans;
        ans = s1.indexOf(s2);
        return ans;
    }
}