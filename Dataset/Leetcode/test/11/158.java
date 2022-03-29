class Solution {
    public int XXX(int[] height) {
        int n=height.length;
        int l=0,r=n-1,area,max=0;//缩小范围
        while(l<r){
            area=(r-l)*Math.min(height[l],height[r]);
            max=Math.max(max,area);
            if(height[l]<height[r]) l++;
            else r--;
        }
        return max;
    }
}

