 class Solution {
    public int XXX(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int sum = 0;

        while (left < right) {
            int heights = height[left] < height[right] ? height[left] : height[right];
            int widths = right - left;
            sum = Math.max(sum, heights * widths);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            } 
        }

        return sum;
    } 
}

