 class Solution {
    public int XXX(int[] height) {
        int max = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            int tmp;
            if(height[i] < height[j]){
                tmp = height[i] * (j - i);
                i++;
            }else{
                tmp = height[j] * (j - i);
                j--;
            }
            if(tmp > max){
                max = tmp;
            }
        }
        return max;
    }
}

