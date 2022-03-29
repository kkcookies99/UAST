 class Solution {
    public int XXX(int[] height) {
        int j=height.length-1;
        int max=0;
        for(int i=0;i!=j;){
            int min=Math.min(height[i],height[j]);
            int a=height[i]<height[j]?i++:j--;
            max=Math.max(max,min*(j-i+1));
        }
        return max;
    }
}

