import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String str1 = null, str2 = null;
        int i, j, c;
        for (i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '.') {
                str1 = n.substring(0, i);//返回数字的整数部分
                str2 = n.substring(i + 1);//返回数字的小数部分
                break;
            }
        }
        i = str2.length();
        c = (int) Math.pow(10, i);
        int a = Integer.parseInt(str2);//将字符串中的数字转换为整数类型
        int b = Integer.parseInt(str1);

        for (j = 2; j <= a; j++) {
            if ((a % j == 0) && (c % j == 0)) {
                a = a / j;
                c = c / j;
                j = 1;
            }
        }//c为分母
        System.out.println(b * c + a + "/" + c);
    }
}