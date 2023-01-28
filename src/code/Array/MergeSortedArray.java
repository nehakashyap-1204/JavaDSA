package code.Array;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,5,10,12};
        int n1= nums1.length;
        int[] nums2 = {2,4,6,8,10,13};
        int n2 = nums2.length;
        int[] nums3 = new int[n1 + n2];

       mergeSortedArray(nums1,nums2,n1,n2,nums3);

        System.out.println("After Merging Array");
        for (int i = 0; i < n1+n2; i++) {
            System.out.print(nums3[i] + " ");
        }

    }
    public static void mergeSortedArray(int[] nums1, int[] nums2, int n1, int n2, int[] nums3) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2){
            if (nums1[i] < nums2[j]){
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }
        while (i < n1){
            nums3[k++] = nums1[i++];
        }
        while (j < n2){
            nums3[k++] = nums2[j++];
        }

    }

}
