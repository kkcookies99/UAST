 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] result=new int[2];
        boolean flag=true;
        for (int i = 0; i < nums.length && flag; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i==j){
                    continue;
                }
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    flag=false;
                    break;
                }
            }
        }
        return result;
    }
}

