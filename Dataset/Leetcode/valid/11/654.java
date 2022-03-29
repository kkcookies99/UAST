 class Solution {
    public int XXX(int[] height) {
        int i = 0, j = height.length - 1, area = 0, h;
        while(i < j){
            h = height[i] > height[j] ? height[j] : height[i];
            area = area < h * (j - i) ? h * (j - i) : area;
            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }
        }
        return area;
    }
}

