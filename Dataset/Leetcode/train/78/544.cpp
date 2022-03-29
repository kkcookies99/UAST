 class Solution {
    vector<vector<int>> res; 
public:
    vector<vector<int>> XXX(vector<int>& nums) {                
        vector<int> v;
        for(int i = 1; i < (1 << nums.size()); ++i) {
            vector<int> v;
            for(int j = 0; j < nums.size(); ++j) {
                if(((i >> j) & 1) == 1) 
                    v.push_back(nums[j]);
            }
            res.push_back(v);
        }
        res.push_back(vector<int>());
        return res;
    }
};

