class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>res;
        vector<int>ans;
        int n=nums.size();
        for(int i=0;i<1<<n;i++){
            for(int j=0;j<n;j++){
                if(i&1<<j)ans.push_back(nums[j]);
            }
            res.push_back(ans);
            ans.clear();
        }
        return res;
    }
};

