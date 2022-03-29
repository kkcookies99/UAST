 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1, b = n - 1, index = m + n - 1;
        while (a >= 0 || b >= 0) {
            if (a >= 0 && b >= 0) {
                nums1[index--] = nums1[a] >= nums2[b] ? nums1[a--] : nums2[b--];
            }
            else if (b >= 0) {
                nums1[index--] = nums2[b--];
            }
            else {
                break;
            }
        }
    }
}

