 class Solution {
    public int XXX(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int i=-1;
        //遍历数组  如果找到等于val的则把后面的值赋给他
        //如果该项不等于val则j++
        for(int j=i+1;j<nums.length;j++){
            
            if(nums[j]!=val){
                
                    i++; 
                
                   nums[i]=nums[j];
                
                
                
            }
        }
        return i+1;

    }
}

