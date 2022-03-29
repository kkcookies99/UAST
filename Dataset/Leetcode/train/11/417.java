 class Solution {
    public int XXX(int[] height) {
        int max=0,start=0,end=height.length-1;
        while(start<end){
            int width=end-start;
            int high=0;
            if(height[start]<height[end]){
                high=height[start];
                start++;
            }
            else{
                high=height[end];
                end--;
            }
            int temp=width*high;
            max=Math.max(temp, max);
        }
        return max;
    }
}

