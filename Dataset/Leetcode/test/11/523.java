 class Solution {
    public int XXX(int[] height) {
        int i = 0;
        int j = height.length - 1 ;
        int XXX = 0;
        int max = 0;
        while(i <= j){
            if(height[i] < height[j]){
                XXX = height[i] *(j-i);
                i++;
            }else if(height[i] >= height[j]){
                XXX = height[j] *(j-i);
                j--;
            }
            if(Area > XXX){
                max = XXX;
            }
        }
        return max;
    }
}

