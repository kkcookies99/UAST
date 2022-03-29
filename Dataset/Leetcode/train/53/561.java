 class Solution {
    public int XXX(int[] nums) {
        int maxValue = nums[0];
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                temp = temp + nums[j];
                if(temp>maxValue){
                    maxValue = temp;
                }       
            }
            temp = 0;
        }
        return maxValue;
    }
}

