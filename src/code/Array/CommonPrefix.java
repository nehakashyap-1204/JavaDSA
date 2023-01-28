package code.Array;

import java.util.Arrays;

public class CommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flyover", "flight", "flow"};
        System.out.println(longestCommonPrefix2(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() -1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }

        }
        return prefix;
    }

    public static String longestCommonPrefix2(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length -1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;
            result.append(first[i]);
        }
        return result.toString();
    }
}
