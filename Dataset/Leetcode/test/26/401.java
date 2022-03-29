 class Solution {
    public int XXX(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length-1;i++){ 
            if(nums[i+1]==nums[i]){
                continue;//遇见相同的提前跳出当前循环，直接进入下一循环
            }else{
                j++;//j计数
                nums[j]=nums[i+1];
            }
        }
        return j+1;
    }
}

