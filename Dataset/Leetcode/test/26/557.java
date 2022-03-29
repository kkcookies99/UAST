 class Solution {
    public int XXX(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int mid=nums[0];//存放第一个值
        int midNum=0;//存放全部重复的次数
        int lengt=1;//计数
        for(int i=1;i<nums.length;i++){
            if(nums[i]==mid){
                midNum++;
                continue;
            }else {
                nums[i-midNum]=nums[i];
                mid=nums[i];
                lengt++;
            }
        }
        return lengt;
    }
}

