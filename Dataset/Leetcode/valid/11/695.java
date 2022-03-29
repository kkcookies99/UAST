 class Solution {
    public int XXX(int[] height) {
        int n = height.length;
        int max = 0;
        int i = 0, j = n - 1;
        while (i < j){
            max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
            if (height[i] == Math.min(height[i], height[j])){
                int tmp = height[i];
                for (; i < j; i++){
                    if (height[i] > tmp) break;
                }
            }
            else {
                int tmp = height[j];
                for (; j > i; j--){
                    if (height[j] > tmp) break;
                }
            }
        }
        return max;
    }
}

