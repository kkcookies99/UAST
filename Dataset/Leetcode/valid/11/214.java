class Solution {
    public int XXX(int[] height) {
        int max = 0;
        int j = height.length-1;
        int i = 0;
        while(i<j){
            int area = 0;
            if (height[i] <= height[j]){
                area = height[i] * (j-i);
                i++;
            }else {
                area =  height[j] * (j-i);
                j--;
            }
            max = area > max ? area : max;
        }
        return max;
    }
}

