 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        return (nums1.length + nums2.length & 1) == 0 ? (findKthNumber(nums1, 0, nums2, 0, (nums1.length + nums2.length >> 1)) + findKthNumber(nums1, 0, nums2, 0, (nums1.length + nums2.length >> 1) + 1)) / 2.0 :findKthNumber(nums1, 0, nums2, 0, (nums1.length + nums2.length >> 1) + 1);
    }
    public int findKthNumber(int[] nums1, int i, int[] nums2, int j, int k) {
        if (nums1.length - i > nums2.length - j) return findKthNumber(nums2, j, nums1, i, k);
        if (nums1.length == i) return nums2[j + k - 1];
        if (k == 1) return Math.min(nums1[i], nums2[j]);
        return nums1[Math.min(i + (k >> 1), nums1.length) - 1] > nums2[j + (k >> 1) - 1] ? findKthNumber(nums1, i, nums2, j +(k >> 1), k -(k >> 1)) : findKthNumber(nums1, Math.min(i + (k >> 1), nums1.length), nums2, j, k - (Math.min(i + (k >> 1), nums1.length) - i));
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


