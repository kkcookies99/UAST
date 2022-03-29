 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0;i <= nums.length - 2;i+=2){
            if(nums[i] != nums[i + 1]){
                result = nums[i];
                return result;
            } 
        }
        return nums[nums.length - 1];
    }
}```

