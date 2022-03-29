 class Solution {
    public int XXX(int[] height) {
        /*暴力*/
        // int max=0;
        // for(int i=0;i<height.length;i++)
        // {
        //     for(int j=i+1;j<height.length;j++)
        //     {
        //         max=Math.max(Math.min(height[i],height[j])*(j-i),max);
        //     }
        // }
        // return max;
        /*双脚标向中间逼近*/
        int l=0,r=height.length-1;
        int max=0;
        while(l<r)
        {
            max=Math.max(Math.min(height[l],height[r])*(r-l),max);
            if(height[l]>=height[r]) r--;
            else l++;
        }
        return max;
    }
}

