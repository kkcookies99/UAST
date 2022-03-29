class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n=nums.size();
        vector<vector<int>> res;
        for(int i=0;i<1<<n;i++){
            res.push_back(vector<int>());
            for(int j=0;j<n;j++){
                if(i>>j&1){
                    res.back().push_back(nums[j]);
                }
            }
        }
        return res;
    }
};

