class Solution {
    public int XXX(int[] height) {
        if(height.length<=1)return 0;
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            if(height[left]<height[right]){
                max=Math.max(max,height[left]*(right-left));
                int tmp=height[left];
                left++;
                
                while(left<right&&tmp>=height[left]){
                    left++;
                }
                
            }else{
                max=Math.max(max,height[right]*(right-left));
                int tmp=height[right];
                right--;
                
                while(left<right&&tmp>=height[right]){
                    right--;
                }
            }
        }
        return max;
    }
}

