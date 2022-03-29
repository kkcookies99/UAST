class Solution {
    public int XXX(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int current, h;
        int max = 0;
        
        while(left < right)
        {
            if(height[left] > height[right])
            {
                h = height[right];
                right--;
            }
            else
            {
                h = height[left];
                left++;
            }
            current = h * (right - left + 1);
            if(current > max)
                max = current;
        }
        return max;
    }
}

