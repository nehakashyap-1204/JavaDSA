package code.Array;

public class RotatedAndSorted {
    public static void main(String[] args) {
        int[] nums = {4,5,1,2,3};
        System.out.println(check(nums));
    }
    public static boolean check(int[] arr) {
        int pivot = -1;
        if(arr.length==0 || arr.length== 1)
            return true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1]>arr[i]){
                pivot = i;
                break;
            }
        }
        if(pivot==-1)
            return true;
        for(int i = pivot; i<arr.length-1; i++){
            if(arr[i]>arr[i+1])
                return false;
        }
        return arr[0]>=arr[arr.length-1] ? true : false;
    }
}
