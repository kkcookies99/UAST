class Solution {
    public int XXX(int[] height) {
        int len = height.length;
        int left = 0,right = len-1;
        int max=0;
        while(left>=0 && right<len && left<=right){
            int t;
            if(height[left]<height[right]){
                t = height[left]*(right-left);
                left++;
            }else{
                t = height[right]*(right-left);
                right--;
            }
            if(t>max) max = t;
        }
        return max;
    }
}

