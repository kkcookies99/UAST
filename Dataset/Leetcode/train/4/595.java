 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        // 游标代表当前遍历到的地方
        int l = 0;
        int l1 = 0;
        int pre = -1;
        int cur = -1;
        int distance = 0;

        // 判断奇偶
        int sum = nums1.length + nums2.length;

        // 开始游走
        while(distance < sum / 2 + 1){
            pre = cur;
            if(l < nums1.length && (l1 >= nums2.length || nums1[l] < nums2[l1])){
                cur = nums1[l++];
            }else{
                cur = nums2[l1++];
            }
            distance++;
        }

        // 根据奇偶判断取值
        if(sum % 2 == 0){
            return (pre + cur) / 2.0;
        }else{
            return cur;
        }

    }
}

