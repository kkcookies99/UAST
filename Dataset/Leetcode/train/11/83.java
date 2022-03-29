public int XXX(int[] height) {
        int len=height.length;
        int i=0,j=len-1,ans=0;
        while(i!=j){
            ans=Math.max(ans,Math.min(height[i],height[j])*(j-i));
            i = height[i]>height[j]?i:i+1;
            j = height[i]>height[j]?j-1:j;
        }
        return ans;
    }

