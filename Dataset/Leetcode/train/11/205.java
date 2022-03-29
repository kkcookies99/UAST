class Solution {
    public int XXX(int[] height) {
        int max = 0 ,start = 0, end = height.length-1;
        while (start < end){
            int h = Math.min(height[start],height[end]);
            max = Math.max(max,h*(end - start));
            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}

