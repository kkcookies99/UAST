class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size();
        vector<vector<int>> res;
        vector<int> tmp;
        vector<int> tmp1(n, 0);
        Helper(res, tmp, nums, tmp1);
        return res;
    }
    void Helper(vector<vector<int>>& res, vector<int>& tmp, vector<int>& nums, vector<int>& tmp1){
        if(tmp.size() == nums.size()){
            res.push_back(tmp);
            return;
        }
        for(int i = 0; i < nums.size(); i++){
            if(tmp1[i] == 1){
                continue;
            }
            tmp.push_back(nums[i]);
            tmp1[i] = 1;
            Helper(res, tmp, nums, tmp1);
            tmp1[i] = 0;
            tmp.pop_back();
        }
    }
};

