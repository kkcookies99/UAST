 class Solution {
    public int XXX(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            if(height[i]<height[j]){
                max = max>height[i]*(j-i)?max:height[i]*(j-i);
                i++;
            }else{
                max = max>height[j]*(j-i)?max:height[j]*(j-i);
                j--;
            }
        }
        return max;
    }
}

