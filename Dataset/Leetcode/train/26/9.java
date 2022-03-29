 class Solution {
    public int XXX(int[] nums) {
        int temp,count=0;
        if(nums.length==0){
            return 0;
        }
        temp=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=temp){
                count++;
                nums[count]=nums[i];
                temp=nums[i];
            }
        }
        return count+1;
    }
}```

