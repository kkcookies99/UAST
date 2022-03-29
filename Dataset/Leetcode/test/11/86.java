class Solution {
    public int XXX(int[] height) {
        int mh=0;
        int n=height.length;
        int max=0;
        for(int i=0;i<n;i++){
           if(i>0&&height[i]<mh) continue;
            else mh=height[i];
            for(int j=n-1;j>i;j--){
                max=Math.max(max,(j-i)*(Math.min(height[j],height[i])));
            }
        }
        return max;
    }
}

