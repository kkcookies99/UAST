 class Solution {
    public boolean XXX(int[] nums) {
        int[] maxLength=new int[nums.length];
        maxLength[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            maxLength[i]=Math.max(i+nums[i],maxLength[i-1]);
        }
        for(int k=0;k<nums.length-1;k++){
            if(maxLength[k]<=k){
                return false;
            }
        }
        return true;
    }
}

