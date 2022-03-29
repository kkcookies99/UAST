class Solution {
    public int XXX(int[] height) {
        int i=0,j=height.length-1;
        int ans=0;
        while(i<j){
            ans=Math.max(ans,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}

