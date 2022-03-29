 class Solution {
    public boolean XXX(int[] nums) {
        int maxIndex = 0;
        int edge = 0;
        int length = nums.length;
        int temp;

        for(int i = 0; i < length; i++){
            temp = nums[i]+i;
            maxIndex = temp>maxIndex ? temp : maxIndex;
            if(maxIndex>=length-1){
                return true;
            }
            if(edge==i){
                if(maxIndex==edge){
                    return false;
                }
                edge = maxIndex;
            }
        }
        return true;
    }
}

