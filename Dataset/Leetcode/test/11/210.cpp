class Solution {
public:
    int XXX(vector<int>& height) {
        int maxValue = 0;
        int left = 0;
        int right = height.size()-1;

        while (left < right) {
            maxValue = max(min(height[left], height[right]) * (right - left), maxValue);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxValue;
    }
};

