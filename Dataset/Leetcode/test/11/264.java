class Solution {
    public int XXX(int[] height) {
            //双指针 哪边短就向那边走  并且维护一个最大值
            int left = 0;
            int right=height.length-1;
            int max =-1;
            while(left < right){
                max =  Math.max(max,Math.min(height[left],height[right]) * (right-left));
                if(height[left] > height[right]){
                    right--;
                }else{
                    left++;
                }
            }
            return max;
    }
}

