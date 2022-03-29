class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> t;
        ans.push_back(t);
        for(int i=0;i<nums.size();i++)
        {
            int n=ans.size();
            for(int j=0;j<n;j++)
            {
                t = ans[j];
                t.push_back(nums[i]);
                ans.push_back(t);
            }
        }
        return ans;
    }
};

