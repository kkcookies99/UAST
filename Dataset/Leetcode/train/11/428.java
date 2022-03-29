 class Solution {
    public int XXX(int[] height) {
        int ret=0;

        int left=0,right=height.length-1;

        while(left<right){

            ret=Math.max(ret,Math.min(height[left],height[right])*(right-left));

            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return ret;

    }
}

