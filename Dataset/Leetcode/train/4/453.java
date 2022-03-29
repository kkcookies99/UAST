 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int medi1 = len / 2;
        int medi2 = medi1;
        if (len % 2 == 0) {
            medi1 = (len - 1) / 2;
        }
        int i = 0, j = 0, k = 0;
        double res = 0;
        while (true) {
            int val = 0;
            if (i >= nums1.length) {
                val = nums2[j];
                j++;
            } else if (j >= nums2.length) {
                val = nums1[i];
                i++;
            }
            else if (nums1[i] < nums2[j]) {
                val = nums1[i];
                i++;
            } else {
                val = nums2[j];
                j++;
            }
            if (k == medi1) {
                res = val;
            }
            if (k == medi2) {
               return (res + val) / 2;
            }
            k++;
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

