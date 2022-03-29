 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,p=m+n-1;//从后往前，最大的放在num1的最后面
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]) nums1[p--]=nums1[i--];
            else nums1[p--]=nums2[j--];
        }
        while(j>=0) nums1[p--]=nums2[j--];
    }
   
}

