class Solution {
    public int XXX(int[] height) {
        int s = 0, e = height.length - 1;
        int result = 0, value, flag;
        while (s < e) {
            if (height[s] >= height[e]) {
                // right is smaller
                if (result < (value = height[e] * (e - s))) {
                    result = value;
                }
                flag = height[e];
                while (s < e && height[e] <= flag) e--;
            } else {
                // left is smaller
                if (result < (value = height[s] * (e - s))) {
                    result = value;
                }
                flag = height[s];
                while (s < e && height[s] <= flag) s ++;
            }
        }
        return result;
    }
}

