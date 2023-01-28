package code.Array;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int i = s.length() -1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        if (i < 0){
            return 0;
        }
        int count = 0;
        while (i >= 0 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }
}
