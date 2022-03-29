 class Solution {
public:
    int f[30010];
    int XXX(vector<int>& nums) {
        int n = nums.size();
        int res = INT_MIN;
        memset(f, -0x3f, sizeof f);
        f[0] = 0;
        for(int i=1; i<=n; i++) {
            f[i] = max(f[i-1] + nums[i-1], nums[i-1]);
            res = max(res, f[i]);
        }
        return res;
    }
};

