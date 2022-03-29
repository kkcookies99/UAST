 class Solution {
    public int XXX(int[] nums, int val) {
        if(nums.length<=0) return 0;
        
        int slow=0;
        
        int fast = 0;
        while(fast<nums.length){
            if(nums[fast]==val){
                fast++;
                continue;
            }
            nums[slow++] = nums[fast++];
        }
        return slow;
    }
}

