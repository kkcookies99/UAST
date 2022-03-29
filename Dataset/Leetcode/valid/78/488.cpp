 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        
        int n = nums.size();
        int N = (1 << n);
        vector<vector<int>> ans(N);
        
        // 如果 j 的第 i 位是1,那么就把 nums[i] 添加到 ans[j] 中
        for (unsigned int i = 0; i < n; ++i) {
            for (unsigned int j = 0; j < N; ++j) {
                if (j & (1 << i)) {
                    ans[j].push_back(nums[i]);
                }
            }
        }
        
        return ans;
    }
};

