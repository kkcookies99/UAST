 class Solution {
    public int XXX(int[] height) {
        int left=0,right=height.length-1;
        int min = height[left] > height[right] ? height[right] : height[left];
        int max = (right-left)*min;
        while (left<right){
            if(height[left]<height[right]){
                left++;
                min = height[left] > height[right] ? height[right] : height[left];
            }else if(height[left]>=height[right]){
                right--;
                min = height[left] > height[right] ? height[right] : height[left];
            }
            if ((min*(right-left))>max){
                max = min*(right-left);
            }
        }
        return  max;
    }
}



