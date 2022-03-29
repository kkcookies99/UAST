class Solution {
    public int XXX(int[] height) {
        int max = 0, nmax = 0;
        int i = 0, j = height.length - 1;
        int a;
        while(i < j){
            if (height[i] <= height[j]){
                nmax =  height[i] * (j - i);
                a = height[i];
                while(height[++i] <= a && i < j);
            }else{
                nmax =  height[j] * (j - i);
                a = height[j];
                while(height[--j] <= a && i < j);
            }
            if (nmax > max)max = nmax;
        }
        return max;
    }
}

