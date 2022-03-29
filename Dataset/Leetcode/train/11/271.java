class Solution {
    public int XXX(int[] height) {
        int left = 0;
        int right = height.length-1;

        int max = Math.min(height[left],height[right])*(right-left);
        while(left<=right){
            int temp = 0;
            temp = Math.min(height[left],height[right])*(right-left);  
            if(temp>max) max = temp;
            if(height[left]>height[right]) {
                right-=1;
                continue;
            }
            if(height[left]<=height[right]) {
                left+=1;
                continue;
            }
        }
        return max;
    }
}

