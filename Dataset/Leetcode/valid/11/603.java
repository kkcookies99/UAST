 class Solution {
    public int XXX(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = Math.min(height[left], height[right]) * (right - left);
        while (right > left) {
            if (height[left] <= height[right]) left++;
            else right--;
            int s = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, s);
        }
        return max;
    }
}

