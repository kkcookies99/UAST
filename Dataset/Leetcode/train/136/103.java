 class Solution {
    public int singleNumber(int[] nums) {
             Arrays.sort(nums);
             int i=0;
             while(i<nums.length-1){
             if(nums[i]!=nums[i+1])
                return nums[i];
                i=i+2;
             }
                if(i==nums.length-1)
                return nums[i];
                return 0;
        
           
    }
}

