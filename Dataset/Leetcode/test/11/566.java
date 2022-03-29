 class Solution {
    public int XXX(int[] height) {
        int l = 0,r = height.length - 1;
        int max = 0;
        while(l < r){
            int tmp = (height[r] >= height[l] ? height[l] : height[r]) * (r - l);
            max = Math.max(max,tmp);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}

