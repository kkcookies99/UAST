 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
//先判断长度等于1或者结果是第一个数的
       if(nums.length == 1 || nums[0] != nums[1]){
           return nums[0];
       }

//判断中间的，掐头去尾，不会越界
       for(int i = 1 ; i < nums.length - 1 ; i ++){
            if(nums[i] != nums[i - 1] && nums[i] != nums[i+1]){
                return nums[i];
            }
       }
//前面和中间都不是，那就是最后一个了
        return nums[nums.length - 1];
}
}

