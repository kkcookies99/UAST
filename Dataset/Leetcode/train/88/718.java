 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = m+n-1;
        int p = n-1;
        while(p>=0){
            if(i<0||(nums1[i]<nums2[p])){
                nums1[j--] = nums2[p--];
            }else{
                nums1[j--] = nums1[i--];
            }
        }
    }
}

