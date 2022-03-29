 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> res;
        do{
            vector<int> tmp(nums.begin(),nums.end());
            res.push_back(tmp);
        }while(next_permutation(nums.begin(),nums.end()));
        return res;
    }
};

