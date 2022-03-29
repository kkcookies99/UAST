 class Solution {
    public int XXX(int[] nums) {
        int max = nums[0];
        for(int gb :nums){
            if(gb > max){
                max = gb;
            }
        }
        if(nums[0]<0){
            nums[0] = 0;
        }
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]+nums[i]<0){
                nums[i] = 0;
            }
            else{
                nums[i] = nums[i] + nums[i-1];
            }
        }
        //最后去寻结果数组里最大的
        int b = nums[0];
        for(int g :nums){
            if(g > b){
                b = g;
            }
        }
        if(b==0&&max!=0){
            return max;
        }else{
            return b;
        }
        
    }
}

