class Solution {
public:
    int XXX(vector<int>& height) {
        int n = height.size();
        int i = 0;
        int j = n - 1;
        int res = 0;
        while(i < j) {
            res = max(res, min(height[i], height[j]) * (j - i));
            height[i] > height[j] ? j-- :i++;
        }
        return res;
    }
};

