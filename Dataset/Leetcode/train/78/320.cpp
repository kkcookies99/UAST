class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size();
        int mask = 1<<n;
        vector<vector<int>> res;
        vector<int> tmp;
        for(int i = 0; i<mask; ++i){
            for(int j = 0; j<n; ++j){
                if( (i>>j) & 1 ){
                    tmp.push_back(nums[j]);
                }
            }
            res.push_back(move(tmp));
        }
        return res;
    }
};

