import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_2_3 {
    Scanner in = new Scanner(System.in);
    private String s = new String();//声明要处理的字符串

    public static void main(String[] args) {
        Assignment_2_3 assignment = new Assignment_2_3();
        assignment.input();
        ArrayList<Integer> ans = assignment.solve();
        System.out.println("字符串中的数字有:");
        for (int i = 0; i < ans.size(); i++)
            System.out.println(ans.get(i));
    }

    public void input()//输入字符串
    {
        System.out.println("请输入字符串:");
        s = in.nextLine();
    }

    public ArrayList<Integer> solve() {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int temp;
        for (int i = 0; i < s.length(); i++) {
            temp = 0;
            while (s.charAt(i) >= '0' && s.charAt(i) <= '9' && i < s.length()) {
                temp *= 10;
                temp += s.charAt(i) - '0';
                i++;
            }
            if (temp != 0) ans.add(temp);
        }
        return ans;
    }

}