class Solution {
    public int XXX(int[] height) {
        int left = 0, right = height.length - 1;
        int res = 0;
        while(left < right) {
            res = height[left] < height[right] ?
                // 左边的线小于右边的线，更新res，然后左边往右移动一格
                Math.max(res, (right - left) * height[left ++]) :
                // 右边的线小于左边的线，更新res，然后右边往左移动一格
                Math.max(res, (right - left) * height[right --]);
        }
        return res;
    }
}

