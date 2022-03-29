 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        //归并排序思想
        int len = m + n - 1;
        m -= 1;
        n -= 1;
        while (n >= 0 && m >= 0) {
           //首先这两个数组是有序的，两两比较，较大的数先放数组末尾
            if (nums1[m] >= nums2[n]) {
                nums1[len] = nums1[m];
                m--;
            } else {
                nums1[len] = nums2[n];
                n--;
            }
            //指针往前移动
            len--;
        }
        //将nums2剩余数字移至nums1
        while (n >= 0) {
            nums1[len] = nums2[n];
            n--;
            len--;
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


