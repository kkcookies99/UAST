class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> res;
        backtracking(result, res, nums, 0);
        return result;
    }
    void backtracking(vector<vector<int>>& result, vector<int>& res, vector<int>& nums, int n){
        if(res.size() <= nums.size())
            result.push_back(res);
        for(int i=n; i< nums.size(); i++){
            res.push_back(nums[i]);
            backtracking(result, res, nums, i+1);
            res.pop_back();
        }
    }
};

