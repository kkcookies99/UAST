 class Solution {
    public int XXX(int[] nums) {
        int index = 0;
        if (nums.length>0){
            nums[index] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[index]){
                    nums[++index] = nums[i];
                }
            }
            index++;

        }
        return index;
    }
}

