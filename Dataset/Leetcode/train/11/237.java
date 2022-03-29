class Solution {
    public int XXX(int[] height) {
        
        int max = 0;
        for(int i = 0; i < height.length - 1; i++) {
            for(int j = i + 1; j < height.length; j++) {
                int minHeight = Math.min(height[i], height[j]); 
                max = Math.max(minHeight * (j - i), max);
            }
        }
        return max;
    }
}

