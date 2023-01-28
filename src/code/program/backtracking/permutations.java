package code.program.backtracking;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
       arranges("","abc");
       ArrayList<String> ans = arrangesList("","abc");
        System.out.println(ans);
    }
    static void arranges(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            arranges(f + ch + s,up.substring(1));

        }
    }
    static ArrayList<String > arrangesList(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(arrangesList(f + ch + s,up.substring(1)));
        }
        return ans;
    }
}
