class Solution {
public:
    int XXX(vector<int>& height) {
        int maxCon = INT_MIN;
        int i = 0, j = height.size() - 1;
        while (i <= j) {
            maxCon = max(maxCon, (j - i) * min(height[i], height[j]));
            if (height[i] < height[j]) i++;
            else j--;
        }
        return maxCon;
    }
};

