 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        // 始终保证nums1为较短的数组，nums1过长可能导致j为负数而越界
        if (nums1.length > nums2.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        
        int m = nums1.length;
        int n = nums2.length;

        // m+n 为奇数，分割线要求左侧有 (m+n)/2 + 1 个元素
        // m+n 为偶数，分割线要求左侧有 (m+n)/2     个元素
        // 两种情况其实可以统一写作 (m+n+1)/2，表示对(m+n)/2向上取整
        // 对整数来说，向上取整等于：(被除数 + (除数 - 1)) / 除数
        // 也可以使用Math类中提供的库函数
        int leftTotal = (m + n + 1) / 2;
        int left = 0, right = m;
        while (left < right) {
            // +1 向上取整避免 left + 1 = right 时可能无法继续缩小区间而陷入死循环
            int i = left + (right - left + 1) / 2;
            int j = leftTotal - i;
            
            //要找最大i，使得nums1[i-1] <= nums2[j]
            //使用对立面缩小区间
            if (nums1[i - 1] > nums2[j]) {
                // [i+1, m]均不满足
                right = i - 1;
            } else {
                // i满足说明[0, i-1]均不为满足条件的最大i，舍去以缩小区间
                left = i;
            }
        }

        //退出循环时left=right，表示最终nums1中分割线的位置
        int i = left;
        //nums2中分割线的位置
        int j = leftTotal - left;
        System.out.println(i);

        //判断极端情况
        int nums1LeftMax = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];  //nums1分割线左边没有元素
        int nums2LeftMax = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];  //nums2分割线左边没有元素
        int nums1RightMin = (i == m) ? Integer.MAX_VALUE : nums1[i];     //nums1分割线右边没有元素
        int nums2RightMin = (j == n) ? Integer.MAX_VALUE : nums2[j];     //nums2分割线右边没有元素

        if ((m + n) % 2 == 0) {
            return (Math.max(nums1LeftMax, nums2LeftMax) + Math.min(nums1RightMin, nums2RightMin)) / 2.0;
        } else {
            return Math.max(nums1LeftMax, nums2LeftMax);
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

