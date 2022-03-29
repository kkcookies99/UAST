class Solution {
    public void XXX(int[] nums) {
        int oneCount = 0;
        int sum = 0;
        int index=0;
        for (int i = 0; i < nums.length; i++) {//确定了1的个数就确定了0的个数以及2的个数
            if(nums[i]==1){
                oneCount++;
            }
            sum+=nums[i];
        }

       int twoCount = (sum - oneCount)/2;
       int zeroCount = nums.length -oneCount-twoCount;
    
        for (int i = 0; i < zeroCount; i++) {
            nums[index++] = 0;
        }

        for (int i = 0; i < oneCount; i++) {
            nums[index++] = 1;
        }

        for (int i = 0; i < twoCount; i++) {
            nums[index++] = 2;
        }
    }
}

