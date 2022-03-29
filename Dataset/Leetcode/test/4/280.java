 public double XXX(int[] nums1, int[] nums2) {
        //参考自https://blog.csdn.net/chen_xinjia/article/details/69258706
        //视频https://www.youtube.com/watch?v=do7ibYtv5nk
        if (nums1.length > nums2.length) {
            //保证 时间负责度为log(min(nums1.length, nums2.length))
            return XXX(nums2, nums1);
        }
        int cutL = 0;
        int cutR = nums1.length;
        int cut1 = 0;
        int cut2 = 0;
        int len = nums1.length + nums2.length;
        while (cut1 <= nums1.length) {
            cut1 = cutL + (cutR - cutL) / 2;
            cut2 = len / 2 - cut1;
            int L1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int L2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int R1 = (cut1 == nums1.length) ? Integer.MAX_VALUE : nums1[cut1];
            int R2 = (cut2 == nums2.length) ? Integer.MAX_VALUE : nums2[cut2];
            //中位数的条件为 L1 <= R2 && L2 <= R1
            if (L1 > R2) {
                //数组1  cut1向左移动
                cutR = cut1 - 1;
            } else if(L2 > R1) {
                //数组2  cut2向左移动 = 数组1 向右移动
                cutL = cut1 + 1;
            } else {
                if (len % 2 == 0) {
                    //偶数
                    L1 = L1 > L2 ? L1 : L2;
                    R1 = R1 < R2 ? R1 : R2;
                    return ((double)(L1 + R1)) / 2;
                } else {
                    //奇数
                    return Math.min(R1, R2);
                }
            } 
        }
        return -1;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

