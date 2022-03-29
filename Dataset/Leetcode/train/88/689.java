 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        //逆向双指针法
        int p = m + n -1, q = m - 1, r= n - 1;
        while(q >= 0 && r >= 0) {
            nums1[p--] = nums1[q] > nums2[r] ? nums1[q--] : nums2[r--];
        }
        if(q < 0) {
            System.arraycopy(nums2, 0, nums1, 0, r + 1);
        }

    }
}

