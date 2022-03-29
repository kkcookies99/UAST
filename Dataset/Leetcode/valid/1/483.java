 class Solution {
    public int[] XXX(int[] nums, int target) {
       //判断数组是否为空
        if(nums==null){
            return null;
        }
        int [] arr=new int[2];
        //循环数组从0到数组的长度
        for(int i=0;i<nums.length;i++){


            //因为不能本身相同所以要在i的基础上加1
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                     return arr;
   
                }
            }
        }
        return arr;
    }   
}

