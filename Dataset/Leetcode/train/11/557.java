 class Solution {
    public int XXX(int[] height) {
        int left = 0;
        int right = height.length -1;
        int res = 0;
        while (left < right) {
            res = Math.max(res,(right-left)*Math.min(height[left],height[right]));
            if(height[left] < height[right]) {
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}

