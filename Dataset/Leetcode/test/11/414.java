 class Solution {
    public int XXX(int[] height) {
        int left = 0;
        int right = height.length-1;
        int ans = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                ans = Math.max(ans,height[left] * (right-left));
                left++; 
            } else {
                ans = Math.max(ans,height[right] * (right-left));
                right--;
            }
        }
        return ans;
    }
}

