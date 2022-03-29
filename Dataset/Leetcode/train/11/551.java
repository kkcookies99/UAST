 class Solution {
    public int XXX(int[] height) {
        int l = 0, r = height.length-1;
        int ans = 0;
        while(l < r) {
            ans = Math.max(ans, (r-l)*Math.min(height[l], height[r]));
            if(height[l] < height[r])
                l++;
            else
                r--;
        }
        return ans;
    }
}

