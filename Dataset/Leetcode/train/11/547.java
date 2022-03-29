 class Solution {
    public int XXX(int[] height) {
        int maxVal = 0;
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int x = j-i;
                int y = height[i];
                if(height[i] > height[j]){
                    y = height[j];
                }
                int val = x * y;
                if(val > maxVal){
                    maxVal = val;
                }
            }
        }
        return maxVal;
    }
}


