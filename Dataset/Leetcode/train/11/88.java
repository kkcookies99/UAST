class Solution {
    public int XXX(int[] height) {
      int min = 0;
        int max = height.length - 1;
        int res = 0;
        while (min < max ) {
            int tmp=Math.min(height[min],height[max])* (max - min);
            res = res >tmp ? res : tmp;
            if (height[min]>height[max]){
                max--;
            }else {
                min++;
            }
        }
        return res;
    }
}

