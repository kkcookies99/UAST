 class Solution {
public:
    int XXX(vector<int>& nums) {
        int res = -0x3f3f3f3f, sum = 0;
        for(auto num : nums) {
            sum = sum > 0 ? sum + num : num;
            res = max(res, sum);
        }
        return res;
    }
};

