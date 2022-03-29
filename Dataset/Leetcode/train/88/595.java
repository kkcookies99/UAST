 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int cur = m + n - 1;
        int i = m - 1, j = n - 1;
        while(j >= 0){
            if(nums1[i] > nums2[j]) {
                nums1[cur--] = nums1[i];
                nums1[i--] = 0;
            }else{
                nums1[cur--] = nums2[j--];
            }
        } 
    }
}

