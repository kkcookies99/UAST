 class Solution {
    public int XXX(int[] nums) {
        //1.特殊情况：数组就一个或者没有的情况
        if(nums == null || nums.length == 1){
            return nums.length;
        }

        //2.正常情况
        int i = 0; 
        int j = 1;
        
        //双指针的方式判断
        //两个指针进行比较，相同，则j后移动
        //两个指针进行比较，不同，则j赋值给i
        while(j<nums.length){
                if(nums[i] == nums[j]){//两个数字相等，j后移动
                    j++;
                }else{//两个数字不等，
                    i++;//i后移一位
                    nums[i] = nums[j];
                }
        }
        return i+1;
    }
}

