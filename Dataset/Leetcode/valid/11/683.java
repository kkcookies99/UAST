 class Solution {
    public int XXX(int[] height) {
        if(height==null||height.length<2)
            return 0;
        int ans=0;
        for(int l=1;l<height.length;l++){
            int i=0;int j=i+l;
            while(j<height.length){
                ans=Math.max(ans,Math.min(height[i],height[j])*l);
                i++;j++;
            }
        }
        return ans;
    }
}

