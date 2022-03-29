 class Solution {
    public int XXX(int[] nums) {
        int index_start = 0;      
        int len = 0;
        for (int i = 1; i<nums.length ; i++){
            if (nums[i] != nums[i-1]){
                len += 1;   // 通过数组元素值改变的次数计算真实的长度
                nums[index_start+1] = nums[i];
                index_start += 1;   // 更新数组的下一个位置
            }
        }
        return len+1;
    }
}

