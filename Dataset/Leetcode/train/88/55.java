 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int l = nums1.length - 1;
        while (j >= 0) {
            if (i < 0) {// nums1数组自身的元素比较完了，把nums2数组中剩余部分插入nums1，可合并至else分支
                nums1[l] = nums2[j];
                j--;
            } else if (nums1[i] > nums2[j]) {
                nums1[l] = nums1[i];
                i--;
            } else {
                nums1[l] = nums2[j];
                j--;
            }
            l--;
        }
    }
}

