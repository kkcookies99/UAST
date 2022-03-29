class Solution {
    public boolean XXX(int[] nums) {
        
        int nowIndex = nums.length - 1;

        for(int i = nums.length-2; i >= 0; i--)
        {
            
            if((nowIndex - i) <= (nums[i]) )
            {
                nowIndex = i;
            }
        }
        if(nowIndex == 0)
            return true;
        else
            return false;
        
    }
}

