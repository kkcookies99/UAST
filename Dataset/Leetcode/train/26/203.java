 class Solution {
    public int XXX(int[] nums) {
        /**
        * i指向已排序区间的末尾，用j遍历数组，与a[i]对比，
        * 如果不相同就插入到已排序区间末尾
        */
        int j = 1;
        int i = 0;
        
        for (;j<nums.length;j++) {
            if (nums[j] != nums[i]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}

