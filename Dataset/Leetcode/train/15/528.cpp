 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size();
        vector<vector<int>> ans;
        sort(nums.begin(), nums.end());
        for(int i=0;i<n;i++) {
            if(i&&nums[i]==nums[i-1])continue;
            int l=i+1, r=n-1;
            while(l<r) {
                if(-nums[i]==nums[l]+nums[r]) ans.push_back({nums[i], nums[l], nums[r]});
                if(-nums[i]<nums[l]+nums[r]) r--;
                else {
                    while(l<n-1&&nums[l]==nums[l+1])l++;
                    l++;
                }
            }
        }
        return ans;
    }
};// -4 -1 -1 0 1 2

