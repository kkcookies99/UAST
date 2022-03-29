 class Solution {
    public int XXX(int[] height) {
        int max = 0, minLen = 0, left = 0, right = height.length - 1;
        while (left < right) {
            minLen = height[left] < height[right] ? height[left++] : height[right--];
            max = Math.max(max, minLen * (right - left + 1)); 
        }
        return max;
    }
}

