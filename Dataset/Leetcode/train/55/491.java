 class Solution {
    public boolean XXX(int[] nums) {
        int len=nums.length;
        if(len == 1)    return  true;
        int maxSize=nums[0];    //作为当前位置可以跳跃的最大长度
        for(int i=0;i<len;i++){
            if(nums[i] >= maxSize){
                maxSize=nums[i];    //当前位置大于或等于最大，即更新
            }else{
                maxSize--;          //没有则表明使用了，减一
            }
            if(maxSize == 0 && i < len-1)    return false;   //使用完了，且没到达终点，前进不了了
        }
        return true;
    }
}```

