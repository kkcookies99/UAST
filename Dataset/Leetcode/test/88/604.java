 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m-1,j=n-1,k=m+n-1;i>=0||j>=0;){
            if(i>=0&&j>=0){
                nums1[k--] = nums1[i]>nums2[j]?nums1[i--]:nums2[j--];
            }else if(i<0){
                nums1[k--] = nums2[j--];
            }else{
                nums1[k--] = nums1[i--];
            }
        }
        return;
    }
}

