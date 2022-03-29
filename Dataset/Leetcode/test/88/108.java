 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int f1 = m-1, f2 = n-1, f = m+n-1;
        while(f1>=0&&f2>=0){
            if(nums1[f1]>nums2[f2]){
                nums1[f] = nums1[f1];
                f1--;
            }else{
                nums1[f] = nums2[f2];
                f2--;
            }
            f--;
        }
        while(f2>=0){
            nums1[f] = nums2[f2];
            f2--;
            f--;
        }
    }
}

