 class Solution4 {

    /**
     * 思路：双指针移动算法
     * @param nums1
     * @param nums2
     * @return
     */
    public double XXX(int[] nums1, int[] nums2) {
        if (nums1 == null) {
            nums1 = new int[0];
        }
        if (nums2 == null) {
            nums2 = new int[0];
        }
        int len = nums1.length + nums2.length;
        //数组nums1对应的指针
        int pointer1 = -1;
        //数组nums2对应的指针
        int pointer2 = -1;
        //n1, n2为用于计算中位数的两个值
        //最近指针指向的元素值，存储上一次遍历计算出的最大值
        int n1 = 0;
        //最新指针指向的元素值，存储最新一次遍历计算出的最大值
        int n2 = 0;
        for (int i = 0; i < len / 2 + 1; i++) {
            //n1始终存储n2的旧值
            n1 = n2;
            //如果pointer1指向数组最后一个元素，只递增pointer2指针
            if (pointer1 == nums1.length - 1) {
                pointer2++;
                n2 = nums2[pointer2];
            }
            //如果pointer2指向数组最后一个元素，只递增pointer1指针
            else if (pointer2 == nums2.length - 1) {
                pointer1++;
                n2 = nums1[pointer1];
            }
            //pointer1和pointer2未指向数组最后一个元素，找出两个指针，当前指向的最小值，指针向前移动并且n2赋最新值
            else if (nums1[pointer1 + 1] > nums2[pointer2 + 1]) {
                pointer2++;
                n2 = nums2[pointer2];
            } else {
                pointer1++;
                n2 = nums1[pointer1];
            }
        }
        if (len == 0) {
            return 0.0;
        } else if (len == 1) {
            return n2 * 1.0;
        } else {
            //如果为偶数个元素，对n1 + n2计算中位数，如果为奇数个元素，n2即是中位数
            return len % 2 == 0 ? (n1 + n2) / 2.0 : n2 * 1.0;
        }
    }
}

