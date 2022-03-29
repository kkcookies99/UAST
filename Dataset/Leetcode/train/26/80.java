 class Solution {
    public int XXX(int[] nums) {
        //快慢指针法
        int i=0,j=1;
        int len=nums.length;
        while(j<len){
            if(nums[i]==nums[j]){
                j++;
            }else{
                nums[++i]=nums[j];
                j++;
            }
        }
        return ++i;
    }
}

