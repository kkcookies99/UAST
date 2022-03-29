class Solution {
    public int XXX(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (right > left) {
            int rightHeight = height[right];
            int leftHeight = height[left];
            max = Math.max(max, (right - left) * Math.min(leftHeight, rightHeight));
            if (leftHeight >= rightHeight) {
                while (right > left && height[right] <= rightHeight) {
                    right--;
                }
            } 
            if (leftHeight <= rightHeight) {
                while (right > left && height[left] <= leftHeight) {
                    left++;
                }
            }
        }
        return max;
    }
}

