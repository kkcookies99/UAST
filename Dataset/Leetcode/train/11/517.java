 class Solution {
    public int XXX(int[] height) {
            int i=0,j=height.length-1,max=0;
            while(i!=j){
                int area=Math.min(height[i],height[j])*(j-i);
                if(area>max){
                    max=area;
                }
                if(height[i]>height[j]){
                    j--;
                }else{
                    i++;
                }
                
            }
            return max;
    }
}

