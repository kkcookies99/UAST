 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
            int[] num = new int[nums1.length + nums2.length];
        int tarnum1 = 0;
        int tarnum2 = 0;
        double mid = 0.00000d;
        //合并数组
        for (int i = 0; i < num.length; i++) {
            if (tarnum1 < nums1.length && tarnum2 < nums2.length) {
                if (nums1[tarnum1] <= nums2[tarnum2]) {
                    num[i] = nums1[tarnum1];
                    tarnum1++;
                } else {
                    num[i] = nums2[tarnum2];
                    tarnum2++;
                }
            } else {
                if (tarnum1 == nums1.length) {
                    num[i] = nums2[tarnum2];
                    tarnum2++;
                } else if (tarnum2 == nums2.length) {
                    num[i] = nums1[tarnum1];
                    tarnum1++;
                }
            }

        }
        //找中位数
        if (num.length % 2 == 0) {
            mid = (num[num.length / 2 ] + num[num.length / 2 - 1]) / 2.0;
        } else {
            mid = num[num.length / 2 ];
        }
        return mid;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


