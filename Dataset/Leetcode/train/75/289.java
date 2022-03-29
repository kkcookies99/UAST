class Solution {
    public void XXX(int[] nums) {
        int red = 0, white = 0;
        for(int num: nums){
            if(num == 0){
                red++;
            }else if(num == 1){
                white++;
            }
        }
        white += red;
        for(int i = 0; i < nums.length; i++){
            if(i < red){
                nums[i] = 0;
            }else if(i < white){
                nums[i] = 1;
            }else{
                nums[i] = 2;
            }
        }
    }
}

