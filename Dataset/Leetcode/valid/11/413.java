 class Solution {
    public int XXX(int[] height) {
        int sum=0;
        int i=0;
        int j=height.length-1;
        while(i!=j){
            if(height[i]<height[j]){
                if(sum<(j-i)*Math.min(height[j],height[i])){
                    sum=(j-i)*Math.min(height[j],height[i]);
                }
                i++;
            }else{
                if(sum<(j-i)*Math.min(height[j],height[i])){
                    sum=(j-i)*Math.min(height[j],height[i]);
                }
                j--;
        }  
    }
    return sum;
}
}

