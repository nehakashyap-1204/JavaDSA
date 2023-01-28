package code.Array;

public class PowerofTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==0 || n<0)
            return false;
        if(n==1)
            return true;
        while(n>1) {
            if(n%2==0)
                return isPowerOfTwo(n/2);
            else {
                return false;
            }
        }
        return true;

    }
}
