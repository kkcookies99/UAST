 class Solution {
    public int XXX(int[] nums) {
        int r = 1, w = 0;
        while(r < nums.length){
            if(nums[r] != nums[w]){            
                nums[++w] = nums[r];                
            }    
            r++;        
        }
        return w+1;
    }
}

