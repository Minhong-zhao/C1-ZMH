import java.util.Arrays;
import java.util.HashMap;

public class Task7 {
    public static void main(String[] args) {
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("输入:" + Arrays.toString(s));
        System.out.println(mergechuan(s));

    }

    private static HashMap<String, String> mergechuan(String[] s) {
        HashMap<String, String> ans = new HashMap<>();
        String[] A = new String[s.length];
        for (int i = 0; i < s.length; i++) {
            char[] m = s[i].toCharArray();
            Arrays.sort(m);
            String n = String.valueOf(m);
            A[i] = n;
        }
        System.out.println(Arrays.toString(A));
        for (int i = 0; i < s.length; i++) {
            ans.put(s[i], A[i]);
        }

        return ans;
    }
}