 class Solution {
    public int XXX(int[] height) {
        int res = 0;
        if (height == null || height.length == 0)
            return res;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            res = Math.max(res, area);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return res;
    }
}

