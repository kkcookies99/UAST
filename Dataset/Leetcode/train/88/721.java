 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int len = m-- + --n;
        for(int i = len; i >= 0; i--){
            if(m >= 0 && n >= 0){
                if(nums1[m] >= nums2[n])
                    nums1[i] = nums1[m--];
                else
                    nums1[i] = nums2[n--];
            }else if(m < 0)
                nums1[i] = nums2[n--];
        }
    }
}

