class Solution {
public:
    vector<vector<int>> res;
    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size();
        for(int i=0; i<1<<n; i++) {
            vector<int> path;
            for(int j=0; j<n; j++) {
                if(i >> j & 1) {
                    path.push_back(nums[j]);
                }
            }
            res.push_back(path);
        }
        return res;
    }
};

