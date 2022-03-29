 class Solution {
public:
    void permutation(int k, int m, vector<vector<int>>& ret, vector<int>& nums){
        // 固定k
        if(k == m){
            ret.push_back(nums);
        }
        for(int i = k; i <= m; ++i){
            int t = nums[i];
            nums[i] = nums[k];
            nums[k] = t;
            permutation(k+1, m, ret, nums);
            t = nums[i];
            nums[i] = nums[k];
            nums[k] = t;
        }

    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ret;
        permutation(0, (int)nums.size()-1, ret, nums);
        return ret;
    }
};

