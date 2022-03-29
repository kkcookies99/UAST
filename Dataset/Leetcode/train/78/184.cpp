class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>ans;
        int n = nums.size();
        int num = 1<<n;
        for(int i = 0;i<num;i++){
            vector<int>subset;
            for(int j = 0;j<n;j++){
                if(i&(1<<j))subset.push_back(nums[j]);
            }
            ans.push_back(subset);
        }
        return ans;
    }
};

