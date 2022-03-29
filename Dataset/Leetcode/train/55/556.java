 class Solution {
    public boolean XXX(int[] nums) {
        //贪心算法
        int n = nums.length;
        //最远可达位置
        int farthest = 0;
        for(int i = 0; i < n; i++){
            //如果i位置可达
            if(i <= farthest){
                //求出最远能到达的距离
                farthest = Math.max(i + nums[i],farthest);
            }
        }
        return farthest >= n-1;
    }
}

