 class Solution {
    public int XXX(int[] nums, int val) {
       
       int i = 0;
        for (int j = 0; j < nums.length; j++) {
            while( nums[j]==val){
                j++; 
                if(j == nums.length)
                    return i;
            } 
            nums[i++] = nums[j];
                
        }
        return i;
    }
}

