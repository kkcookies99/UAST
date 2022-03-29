 class Solution {
    public int XXX(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int maxVal = 0;
        for(int i=0,j = height.length - 1;i<j;) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            maxVal = Math.max(maxVal,(j-i+1) * minHeight);  //想想i=0,j=8的情况
        }
        return maxVal;
    }
}

