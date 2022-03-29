class Solution {
    public int XXX(int[] height) {
        int i=0, j=height.length-1, ans = 0;
        while(i<j){
            ans = height[i]<height[j]?
                    Math.max(ans, (j-i)*height[i++]) : Math.max(ans, (j-i)*height[j--]);
        }
        return ans;
    }
}

