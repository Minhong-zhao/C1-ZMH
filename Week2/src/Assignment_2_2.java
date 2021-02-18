import java.util.Scanner;

public class Assignment_2_2 {
    Scanner in = new Scanner(System.in);
    private int MAXN = 50, n;//声明字符串最大长度和实际长度;
    private String[] matrix = new String[MAXN];//声明要处理的数组

    public static void main(String[] args) {
        Assignment_2_2 assignment = new Assignment_2_2();
        assignment.input();
        System.out.println("公共最长前缀为:" + assignment.solve());
    }

    public void input()//输入字符串
    {
        System.out.println("请输入字符串的个数:");
        n = in.nextInt();
        in.nextLine();//清除回车符
        System.out.println("请输入" + n + "个字符串:");
        for (int i = 0; i < n; i++)
            matrix[i] = in.nextLine();
    }

    public String solve() {
        String ans = "";
        for (int i = 0; i < matrix[0].length(); i++) {
            for (int j = 0; j < n; j++)
                if (matrix[j].charAt(i) != matrix[0].charAt(i)) return ans;
            ans += matrix[0].charAt(i);
        }
        return ans;
    }
}