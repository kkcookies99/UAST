 class Solution {
    public int XXX(int[] nums) {
        int d=0;
        if (nums.length==0 || nums.length==1){
            return nums.length;
        }else{
            for (int i=0;i<nums.length-1;i++){
                if (nums[i]!=nums[i+1]){
                    nums[d]=nums[i];
                    d=d+1;
                }
            }
            nums[d]=nums[nums.length-1];
            return d+1;
        } 
    }
}

