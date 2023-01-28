package code.program;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12, 25, 45, 50, 66, 70, 85, 99};
        int target = 85;
        //    System.out.println(binarysearch(arr,target,0,arr.length -1));
        //    System.out.println(sum(1526));
        //    System.out.println(product(1556));
        //    reverse(1204);
        //    System.out.println(sum);
        //    System.out.println(count(312522242,0));
        int[] nums = {5, 3, 8, 15, 8, 6, 7, 9, 10, 8};
        ArrayList<Integer> ans = linearsearch(nums, 8, 0, new ArrayList<>());
        //    System.out.println(ans);
    //    System.out.println(skip2("kashyapnehadipak"));

        //    linearsearch(nums,8,0);
        //    System.out.println(list);
        String a = "neha";
        String b = "neha";
        //    System.out.println(a == b);
        String name1 = new String("neha");
        String name2 = new String("neha");
   //     System.out.println(name1 == name2);
     //   System.out.println(name1.equals(name2));
    //    System.out.println(skipstring("stapplear"));
    //    System.out.println(skipstirng2("stapphagyar"));
        ArrayList<String> list = subseq2("","abc");
        System.out.println(list);
        System.out.println(isHappy(2));

    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1){
            return true;
        }
        return false;
    }
    private static int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans = ans + rem * rem;
            number = number / 10;
        }
        return ans;
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            return binarysearch(arr, target, mid + 1, end);
        } else {
            return binarysearch(arr, target, start, mid - 1);
        }
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sum(n / 10);
    }

    static int product(int n) {
        if (n % 10 == n) {
            return n;
        }

        return (n % 10) * product(n / 10);
    }

    static int sum;

    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }

    static int count(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 2) {
            return count(n / 10, c + 1);
        }
        return count(n / 10, c);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void linearsearch(int[] nums, int target, int index) {
        if (index == nums.length) {
            return;
        }
        if (nums[index] == target) {
            list.add(index);
        }
        linearsearch(nums, target, index + 1);
    }

    static ArrayList<Integer> linearsearch(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return linearsearch(arr, target, index + 1, list);
    }

    // subset problems:

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }
    static String skip2(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2( up.substring(1));
        }
    }
    static String skipstring(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipstring(up.substring(5));
        } else {
            return up.charAt(0) + skipstring(up.substring(1));
        }
    }
    static String skipstirng2(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipstirng2(up.substring(3));
        } else {
            return up.charAt(0) + skipstirng2(up.substring(1));
        }
    }
    static void subseq(String p, String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseq2 (String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq2(p + ch, up.substring(1));
        ArrayList<String> right = subseq2(p,up.substring(1));

        left.addAll(right);
        return left;

    }
}



