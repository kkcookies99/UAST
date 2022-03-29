class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        unordered_map<int, int> m;
        vector<vector<int>> res;
        vector<int> tmp;
        func(res, nums, tmp, m);
        return res;
    }
    
    void func(vector<vector<int>>& res, vector<int>& nums, vector<int> tmp, unordered_map<int, int> m){
        if(tmp.size() == nums.size()){
            res.push_back(tmp);
            return;
        }
        for(int i = 0; i < nums.size(); ++i){
            if(m[nums[i]] == 0){
                tmp.push_back(nums[i]);
                m[nums[i]]++; 
                func(res, nums, tmp, m);
                tmp.pop_back();
                m[nums[i]]--;
            }
        }
        return;
    }
};

