 class Solution {
    public int XXX(int[] height) {
        int max=0;
        int low=0;
        int high=height.length-1;
        while(low<high){
            int sum=(high-low)*(int)Math.min(height[low],height[high]);
            if(max<sum){
                max=sum;
            }
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}

