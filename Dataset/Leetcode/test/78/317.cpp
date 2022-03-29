class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> tempVec;
        res.emplace_back(tempVec);
        int queSize = 0;
        for(int num : nums){
            queSize = res.size();
            for(int i = 0; i < queSize; ++i){
                tempVec = res[i];
                tempVec.emplace_back(num);
                res.emplace_back(tempVec);
            }
        }
        return res;
    }
};

