package case2;

public class Solution {
    public double solve(int[] nums1, int[] nums2) {

        int m = nums1.length, n = nums2.length;
        int mergedArraySize = nums1.length+nums2.length;
        int[] mergedArray = new int[mergedArraySize];

        int n1 =0, n2 =0, m1 =0;

        while(n1 <m && n2 <n){
            if (nums1[n1]<nums2[n2]){
                mergedArray[m1++] = nums1[n1++];
            }else{
                mergedArray[m1++] = nums2[n2++];
            }
        }

        while(n1 <m){
            mergedArray[m1++] = nums1[n1++];
        }

        while(n2 <n){
            mergedArray[m1++] = nums2[n2++];
        }


        mergedArraytoString(mergedArray);
        return findMedianofArray(mergedArray);
    }

    private void mergedArraytoString(int[] arr){

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private double findMedianofArray(int[] arr){
        int m = arr.length;

        if (m%2==0){
            return (double) (arr[m/2]+arr[m/2-1])/2;
        }else {
            return (double) arr[m/2];
        }

    }
}