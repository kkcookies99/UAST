 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int len = len1 + len2;
        int[] nums = new int[len];
        int k = 0;
        //将两个数组合并到新的数组中
        for (int i = 0; i < nums1.length; i++) {
            nums[k] = nums1[i];
            k++;
        }
        k = nums1.length;
        for (int j = 0; j < nums2.length; j++) {
            nums[k] = nums2[j];
            k++;
        }
        //对新的数组进行排序
        Arrays.sort(nums);
        //对数组的长度 取模
        int y = len % 2;
        // 中间元素位置的索引值
        int c = len / 2;
        if(y == 1){
            return (double)nums[c];
        }else{
            return (double)(nums[c] + nums[c - 1])/2;
        }
    }
}

