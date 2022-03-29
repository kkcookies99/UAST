 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for (int idx = m + n - 1, i = m - 1, j = n - 1; idx >= 0; idx--) {
            nums1[idx] = j < 0 || (i >= 0 && nums1[i] >= nums2[j]) ? nums1[i--] : nums2[j--];
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


