class Solution {
    public boolean XXX(int[] nums) {
        int len=nums.length;
        int maxn=1;
        for(int i=0;i<len;i++)
        {
            maxn--;
            maxn=Math.max(maxn,nums[i]);
            if(maxn<=0&&(i!=len-1))
            return false;
        }
        return true;
    }
}

