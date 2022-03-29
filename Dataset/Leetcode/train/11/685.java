 class Solution {
    public int XXX(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            max = Math.max(max, (right - left) * (height[left] < height[right] ? height[left++] : height[right--]));
        }
        return max;
    }
}

