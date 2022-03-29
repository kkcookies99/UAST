class Solution {
public:
    //解法1：
    // void dfs(vector<int>& nums, vector<vector<int>>& res, vector<int> t, int now){  
    //     res.push_back(t);
    //     if (now >= nums.size()) {            
    //         return;
    //     } 
    //     for (int i = now; i < nums.size(); ++i){
    //         t.push_back(nums[i]);
    //         dfs(nums, res, t, i + 1);
    //         t.pop_back();
    //     }
    // }
    // vector<vector<int>> XXX(vector<int>& nums) {
    //     vector<vector<int>> res;
    //     vector<int> t;
    //     dfs(nums, res, t, 0);
    //     return res;
    // }
        
    //解法2：
    // vector<vector<int>> XXX(vector<int>& nums){
    //     vector<vector<int>> res{{}};
    //     for (int i = 0; i < nums.size(); ++i){
    //         int n = res.size();
    //         for (int j = 0; j < n; ++ j){
    //             vector<int> t = res[j];
    //             t.push_back(nums[i]);
    //             // res.push_back(t);
    //             res.emplace_back(t);
    //         }
    //     }
    //     return res;
    // }
    
    //解法3：
    vector<vector<int>> XXX(vector<int>& nums){
        int n = 1 << (int)nums.size();
        vector<vector<int>> res;
        for (int i = 0; i < n; ++ i){
            vector<int> t;
            for (int k = 0; k < nums.size(); ++ k){
                if (i & (1 << k)) t.push_back(nums[k]);
            }
            res.push_back(t);
        }
        return res;
    }
};


