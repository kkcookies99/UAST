 class Solution {
    public int XXX(int[] nums, int val) {
        assert nums != null;
        int var = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { // 当前元素 != 传入元素
                int a = nums[var]; // 使用新变量将var下标与i下标的元素值交换
                nums[var] = nums[i];
                nums[i] = a;
                var++; // 下次当前元素 != 传入元素时，与i下标元素进行交换的位置
            }
        }
        return var;
    }
}

