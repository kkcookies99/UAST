 class Solution {
    public int XXX(int[] height) {
        int left=0,right=height.length-1;
        int max=0;
        while(left<right){
            max=Math.max(max,(right-left)*Math.min(height[left],height[right]));
            int temp=0;
            if(height[left]<height[right]){
                temp=height[left];
                while(left<right&&height[left]<=temp){
                    left++;
                }
            }else{
                temp=height[right];
                while(left<right&&height[right]<=temp){
                    right--;
                }
            }
        }
        return max;
    }
}

