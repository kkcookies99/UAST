 class Solution {
    public int XXX(int[] height) {
        int res = 0 ;
        int h = 0 ;
        int l = 0 ;
        int right = height.length-1;
        int left = 0;
        while(left < right){
            h = Math.min(height[left],height[right]);
            l = right - left;
            res = Math.max(res,h*l);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
       return res;
    }
}

