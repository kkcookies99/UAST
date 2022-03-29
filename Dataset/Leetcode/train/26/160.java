 class Solution {
    public int XXX(int[] nums) {

        int ret=0;
        if(nums==null)
            return ret;
        
        if(nums.length<=1)
            return ret+1;
        
        int i=0,j=i+1;
        while(i<nums.length&&j<nums.length){    
          
                if(nums[i]==nums[j])
                    j++;
                else
                    nums[++i]=nums[j++];
                        
        }
        ret=i+1;
        return ret;

    }
}

