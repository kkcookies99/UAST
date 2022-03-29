class Solution {
    public int XXX(int[] height) {
        int start = 0;
        int end = height.length-1;
        int result = 0;
        while(start < end){
            int temp = (end - start) * Math.min(height[start], height[end]);
            if(temp > result) result = temp;
            if(height[end] > height[start]){
                start += 1;
            }else{
                end -= 1;
            }
        }
        return result;
    }
}

