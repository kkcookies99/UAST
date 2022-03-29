 class Solution {
    public int XXX(int[] nums, int val) {
        int i;
        int j = 0;
        for(i = 0; i < nums.length; )
        {
            if(nums[i] == val){
                i ++;
            }
            if(nums[i] != val){
                nums[j] = nums[i];
                j ++;
                i++;
            }
            
        }
        return j + 1;
        
       
    }
}


