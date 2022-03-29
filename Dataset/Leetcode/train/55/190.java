class Solution {
    public boolean XXX(int[] nums) {
        return jump(nums, nums.length - 1);
    }
    public boolean jump(int[] nums, int last){
        if(last == 0)
            return true;
        int min = last;
        for(int i = last - 1; i >= 0; i--){
            if(i < min && nums[i] + i >= last)
                min = i;
        }
        return min != last && jump(nums, min);
    }
}

