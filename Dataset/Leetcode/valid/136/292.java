 class Solution {
    //统计某个元素在数组中出现的次数
    public int arrayCount(int[] nums,int target){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
        }
        return count;
    }
    public int singleNumber(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            count=arrayCount(nums,nums[i]);
            if(count==1){   //找出出现次数为1的元素，返回
                return nums[i];
            }
        }
        return 0;
    }
}

