 class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i+=2){
            //如果到最后一个了都没return出去呢那说明最后一个肯定是，单独写一个判断防止数组越界。
            if(i == n-1) return nums[n-1];
            
            if(nums[i] != nums[i+1]) return nums[i];
        }
        return -1;
    }
}

