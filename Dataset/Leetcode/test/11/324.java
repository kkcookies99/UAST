class Solution {
    public int XXX(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int res = 0;
        while (left < right) {
            int max = height[left] <= height[right] ? (height[left++])*(--len) : (height[right--])*(--len);
            res = Math.max(max, res);

        }
        return res;
    }
}

