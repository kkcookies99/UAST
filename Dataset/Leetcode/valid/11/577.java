 class Solution {
    public int XXX(int[] height) {
        int left=0,right=height.length-1;
        int max=0;
        while(left<right){
            int sum=0;
            if(height[left]>height[right]){
                sum=height[right]*(right-left);
                right--;
            }else{
                sum=height[left]*(right-left);
                left++;
            }
            max=Math.max(max,sum);
        }

        return max;
    }
}

