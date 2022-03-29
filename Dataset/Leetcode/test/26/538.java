 class Solution {
    public int XXX(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        //1.需要两个指针 i ,j
        int i=0;
        
        //2.遍历数组  
        //如果不相同的话，我们就让i++ 并且让值等于
        //相同的话  就一直让j++
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]!=nums[i]){
                    i++;
                    nums[i]=nums[j];
                   
                }
            }
            return i+1;
        
        
    }
}

