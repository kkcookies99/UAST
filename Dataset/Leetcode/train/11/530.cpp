 class Solution {
public:
    int XXX(vector<int>& height) {
        int res = 0;
        int n = height.size();
        int i = 0, j = n - 1;
        while (i < j) {
            res = max(res, min(height[j],height[i]) * (j - i) );
            height[i] < height[j] ? ++ i : -- j;
        }
        return res;
    }
};

