 class Solution {
    public int XXX(int[] nums) {
        int fast = 0,slow = 0;
        while(fast< nums.length){

            if(fast-1>=0 && nums[fast-1] == nums[fast]){
                fast++;
                continue;
            }
            else if(fast-1>=0 && nums[fast-1] != nums[fast]){
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
            else{
                slow++;
                fast++;
            }
        }
        return slow;
    }
}

