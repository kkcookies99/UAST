 class Solution {
    public int XXX(int[] height) {
            int i = 0;
            int j = height.length-1;
            int XXX = 0;
            while (i < j) {
                XXX = height[i] < height[j] ? Math.max(XXX, (j-i)*height[i++]) : Math.max(XXX, (j-i)*height[j--]);
            }
            return XXX;
    }
}

