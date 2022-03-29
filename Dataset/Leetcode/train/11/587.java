 class Solution {
    public int XXX(int[] height) {
        int i = 0, j = height.length-1;
        int max = 0;

        while ( i < j ){

            int minEdge = Math.min(height[i], height[j]);

            int hasMax = minEdge * (height.length - (i + (height.length - j)));
            if(hasMax > max)
                max = hasMax;
            else if (height[i] < height[j])
                i++;
            else
                j--;
        }

        return max;
    }
}

