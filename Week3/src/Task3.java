import java.util.LinkedHashSet;

public class Task3 {
    public static String getSting(String str) {
        LinkedHashSet<Character> hashSet = new LinkedHashSet<>();
        for (char c : str.toCharArray())
            hashSet.add(c);
        StringBuffer sbr = new StringBuffer();
        for (char c : hashSet)
            sbr.append(c);
        return String.valueOf(sbr);
    }

    public static void main(String[] args) {
        String str = getSting("aaabcvvvccccsss");
        System.out.println(str);
    }
}