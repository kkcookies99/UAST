class Solution {
    public int XXX(int[] height) {
  int l=0,r=height.length-1,max=0;
        while (l<r){
            int minH=Math.min(height[l],height[r]);
            max=Math.max(max, (r-l)*minH);
            if (height[l]<height[r]){
                l++;
            }else {
                r--;
            }
        }
        return max;
    }
}

