 class Solution {
    public int[] XXX(int[] nums, int target) {
        int[] result= new int[2];
        //两次for循环
        //用数组中的数去和依次和数组中的每一个数相加
        //同一个数字相加的情况排除
        for(int i =0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                //判断和是否等于target
                if(nums[j]+nums[i]==target){
                    //判断是否是数组中的同一个数字
                    if(i!=j){
                        result[0]=i;
                        result[1]=j;
                        return result;
                    }
                }
            }
        }
        return result;
    }
} 

