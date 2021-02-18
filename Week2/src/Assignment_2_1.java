import java.util.Scanner;

public class Assignment_2_1 {
    Scanner in = new Scanner(System.in);
    int MAXN = 50, n;//声明数组最大长度和实际长度
    int[][] matrix = new int[MAXN][MAXN];//声明要旋转的数组

    public static void main(String[] args) {
        Assignment_2_1 assignment = new Assignment_2_1();
        assignment.input();
        assignment.Rotate();
        assignment.print();
    }

    public void input()//处理数组信息
    {
        System.out.println("请输入数组的长:");
        n = in.nextInt();
        System.out.println("请输入" + n * n + "个数组元素:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = in.nextInt();
    }

    public void Rotate() {
        int i, j, k;
        for (i = 0; i < n / 2; i++)//一层一层旋转,第一次循环选第一层
            for (j = 0; j < n - 2 * i - 1; j++)//一次旋转一整排,当j循环完全进行完后,一整层都转好
            {
                k = matrix[i][j + i];
                matrix[i][j + i] = matrix[n - i - j - 1][i];
                matrix[n - i - j - 1][i] = matrix[n - i - 1][n - i - j - 1];
                matrix[n - i - 1][n - i - j - 1] = matrix[i + j][n - i - 1];
                matrix[i + j][n - i - 1] = k;
            }
    }//时间复杂度o(n方)

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }

}