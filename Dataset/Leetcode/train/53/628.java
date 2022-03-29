 class Solution {
    public int XXX(int[] nums) {
        //思路：1、i不动，j=i从开始移动到尾部（取以i开头的所有子串），求和将最大和保存
        //2、移动i,重复1
        int maxsum = -999999999;
        int sum = 0;
        for(int i = 0;i<nums.length; i++){
            for(int j = i; j<nums.length;j++){
                sum += nums[j];
                if(maxsum < sum){
                    maxsum = sum;
                }
            }
            sum = 0;
        }
        return maxsum;
    }
}

