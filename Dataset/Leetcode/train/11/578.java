 class Solution {
    public int XXX(int[] height) {
        int i=0,j=height.length-1;
        int ans=0;
        while(i<j){
            if(height[i]<height[j]){
                ans=Math.max(ans,(j-i)*height[i]);
                i++;
            }else{
                ans=Math.max(ans,(j-i)*height[j]);
                j--;
            }
        }
        return ans;
    }
}

