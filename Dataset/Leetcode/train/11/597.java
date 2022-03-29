 class Solution {
    public int XXX(int[] height) {
        int max = 0;
        int i=0,j=height.length-1;
        while( i < j ){
            int area = (j-i)*Math.min(height[i],height[j]);
            max = max > area ? max : area;
            if(height[j]>height[i]) i++;
            else j--;
        }
        return max;
    }
}

