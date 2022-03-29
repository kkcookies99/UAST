class Solution {
    public int XXX(int[] nums) {
        int res = Integer.MIN_VALUE;
        int dlen=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(dlen==0){
                if(nums[i]<0)
                {
                    res = Math.max(res,nums[i]);
                }
                else
                {
                    count+=nums[i];
                    res = Math.max(res,count);
                    dlen++;
                }
            }
            else{
                if(count+nums[i]<0){
                    res = Math.max(res,count);                   
                    count=0;
                    dlen=0;
                }
                else{
                    count+=nums[i];
                    res = Math.max(res,count);
                }
            }
        }
        return res;
    }
}

