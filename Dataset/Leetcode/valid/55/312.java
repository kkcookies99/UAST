class Solution {
    public boolean XXX(int[] nums) {
        /*
            法二:贪心算法:
                取当前i+nums[i] 的最大值作为 当前可到达的最远位置maxdistance
                if(maxdistance>=len-1) return true;
                
        */
        int len=nums.length;
        int maxdistance=0;
        for(int i=0;i<=maxdistance;i++){
            maxdistance=Math.max(maxdistance,i+nums[i]);
            if(maxdistance>=len-1) return true;
        }
        return false;
    }
}

