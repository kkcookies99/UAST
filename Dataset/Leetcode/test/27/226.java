 class Solution {
    public int XXX(int[] nums, int val) {
        int i = 0; //指向已移动区间的末尾+1 (修改后的长度)
        int j = i; //指向重复值的位置
        for (; j < nums.length; j++) {
            if (nums[j] != val) {
                // 移动a[j]与a[i]交换,然后i++
                nums[i++] = nums[j];
            }
        }
        return i;
        
    }
}

