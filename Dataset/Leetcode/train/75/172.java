class Solution {
    public void XXX(int[] nums) {
        if(nums.length == 1)
            return;
        int i = 0, p0 = 0, p2 = nums.length-1;
        for(;i<=p2;i++){
            
            if(nums[i] == 0){
            //swap i & p0
                nums[i] = nums[p0] - nums[i];
                nums[p0] = nums[p0] - nums[i];
                nums[i] = nums[i] + nums[p0];
                p0++;
            }
            while(nums[i] == 2){
                if(nums[i]==2){
                    //swap i & p2
                    nums[i] = nums[p2] - nums[i];
                    nums[p2] = nums[p2] - nums[i];
                    nums[i] = nums[i] + nums[p2];
                    p2--;
                }
            }
        }
    }
}

