 class Solution {
    public int XXX(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<nums[i]){
                sum=nums[i];
            }
            max = sum>max?sum:max;
        }
        return max;
    }
}

