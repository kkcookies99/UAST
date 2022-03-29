 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> XXX;
        
        //2 ways: 1, visit; 2,0 ~ 2^n as select vector
        int totalSubsetsCount = pow(2, nums.size());
        
        for(int i = 0;i < totalSubsetsCount;i++) {
            auto select = i;
            vector<int> subset;
            for(int j = 0;j < sizeof(totalSubsetsCount) * 8;j++) {
                auto mask = 1 << j;
                if(select & mask) {
                    subset.push_back(nums[j]);
                }
            }
            XXX.push_back(subset);
        }
        
        return XXX;
    }
};


