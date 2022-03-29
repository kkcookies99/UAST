class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> a;
        sort(nums.begin(),nums.end());
        do
        {
            a.push_back(nums);
        }while(next_permutation(nums.begin(),nums.end()));
        return a;
    }
};

