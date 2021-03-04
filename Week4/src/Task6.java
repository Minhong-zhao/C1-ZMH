import java.util.Stack;

public class Task6 {
    public static void main(String[] args) {
        String s1 = "[()]";
        System.out.println(s1);
        System.out.println(istrue(s1));
        String s2 = "[(])";
        System.out.println(s2);
        System.out.println(istrue(s2));
    }

    private static boolean istrue(String s) {
        Stack<Character> ans = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                ans.push(')');
            } else if (c == '{') {
                ans.push('}');
            } else if (c == '[') {
                ans.push(']');
            } else if (c != ans.pop()) {
                return false;
            }
        }
        return ans.empty();
    }
}