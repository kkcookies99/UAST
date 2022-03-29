 class Solution {
    public int XXX(int[] nums, int target) {
    int len=nums.length/2;
        int begin=0;

        if (nums==null){
            return 0;
        }
        if (nums[0]>=target){return 0;}

        for (int i = 0; i < nums.length /2+1; i++) {

            if (nums[len]<target){
                begin=len;
                len=len+(nums.length-len)/2;

            }else if (nums[len]>target){
                len=begin+(len-begin)/2;
            }else if (nums[len]==target){
                return len;
            }

            if (begin==len){
                return begin+1;
            }
        }
        return begin+1;
    }
}

