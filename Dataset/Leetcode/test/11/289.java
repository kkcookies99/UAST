class Solution {
    public int XXX(int[] height) {
        int capacity = 0;
        int l = 0, r = height.length - 1;
        while (l < r){
            capacity = Math.max(Math.min(height[l], height[r]) * (r - l), capacity);
            if(height[l] <= height[r]) l++;
            else r--;
        }
        return capacity;
    }
}

