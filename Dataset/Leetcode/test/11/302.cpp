class Solution {
public:
    int XXX(vector<int>& height) {
        int maxV = 0;
        int size = height.size();
        int l = 0;
        int r = size - 1;
        while(l < r) {
            maxV = max(maxV, min(height[l], height[r]) * (r -l));
            if(height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        return maxV;
    }
};

