 public class Solution {
    public double FindMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.Length;
        int n = nums2.Length;
        int[] resultArray = new int[m+n];
        int i=0;
        int j=0;
        int k =0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                resultArray[k] = nums1[i];
                i++;
            }else{
                resultArray[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            resultArray[k] = nums1[i];
            k++;
            i++;
        }
        while(j<n){
            resultArray[k] = nums2[j];
            k++;
            j++;
        }

        return k%2==0? (resultArray[k/2] + resultArray[k/2-1])/(double)2 : resultArray[k/2];
    }
}

