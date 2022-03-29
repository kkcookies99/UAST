class Solution {
    public int XXX(int[] height) {
         if(height.length==1){
            return 0;
        }
        int max=0;
        for(int i=0,j=height.length-1;i<height.length&&j>i;){
            int area=(j-i)*Math.min(height[i],height[j]);
            max=Math.max(max,area);
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}

