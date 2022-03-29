 class Solution {
    public int XXX(int[] height) {
        int left=0,right=height.length-1;
        int sum=0;
        int temp=0;
        while(left<right){
            int len=right-left;
           temp=len*Math.min(height[left],height[right]);
           sum=Math.max(temp,sum);
           if(height[left]<height[right]){
               left++;
           }else{
               right--;
           }     
        }  
        return sum; 
    }
}

