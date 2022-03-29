class Solution {
    public int XXX(int[] height) {
        //官方双指针解法。
        //精妙。。。但是感觉像是贪心啊。。。
        int ans = -1;
        int l = 0,r = height.length-1;
        while(l < r)
        {
            ans = Math.max(ans,(r-l)*Math.min(height[l],height[r]));
            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return ans;
    }
}

