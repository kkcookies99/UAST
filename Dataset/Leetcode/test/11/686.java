 class Solution {
    public int XXX(int[] height) {
        int l = 0;
        int r = height.length-1;
        int ans = 0;
        while(l<r){
            int tmp = Math.min(height[l], height[r])*(r-l);
            ans = Math.max(tmp, ans);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}

