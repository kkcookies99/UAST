 class Solution {
    public int XXX(int[] height) {
        int i = 0;
        int k = 1;
        int max = 0;
        while(i < height.length) {
            if(k > height.length -1) {
                i++;
                k = i + 1;
                continue;
            }
            int width = k-i;
            int min = height[i] < height[k] ? height[i] : height[k];
            if (width * min > max) {
                max = width * min;
            }
            k++; 
        }
        return max;
    }
}

