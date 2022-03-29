 class Solution {
    public int XXX(int[] height) {
        int l =0,r =height.length -1;
        int max = 0;
        while(l < r){
            if(height[l] < height[r]){
                max = Math.max(max,height[l] *(r -l));
                l++;
            }else{
                max = Math.max(max,height[r] *(r -l));
                r--;
            }
        }
        return max;
    }
}

