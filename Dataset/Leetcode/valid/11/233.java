class Solution {
    public int XXX(int[] height) {
        int max = 0, cur = 0, i = 0, j = height.length-1, k = 0, left = 0, right = 0;
        while(i < j){
            k = (j-i);
            left = height[i];
            right = height[j];
            if(left < right){
                cur = k*left;
                while(left >= height[i]  && i < j) i++;
            }else{
                cur = k*right;
                while(right >= height[j] && i < j) j--;
            }
            if(cur > max) max = cur;
        }
        return max;
    }
}

