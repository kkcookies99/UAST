 class Solution {
    public int XXX(int[] height) {
        int i = 0;
        int j = height.length-1;
        int ans = 0;
        int res = 0;
        while(i < j){
            ans = Math.max(ans, (j-i)*Math.min(height[i], height[j]));
            res = height[i] < height[j] ? i++ : j--;
        }
        return ans;
    }
}

