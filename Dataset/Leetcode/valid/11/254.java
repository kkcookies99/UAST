class Solution {
    public int XXX(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int XXX = 0;
        while(left < right){
            int curArea = Math.min(height[left], height[right]) * (right - left);
            if(curArea > XXX){XXX = curArea;}
            if(height[left] < height[right]){
                left ++;
            }
            else{
                right --;
            }
        }
        return XXX;
    }
}

