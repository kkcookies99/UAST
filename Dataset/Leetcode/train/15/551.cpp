 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size();
        vector<vector<int>> res;
        sort(nums.begin(), nums.end());
        for(int i = 0; i < n; ++i) {
            if(i && nums[i] == nums[i-1]) continue;
            int sum = -nums[i];
            int l = i+1;
            int r = n-1;
            while(l < r) {
                int t = nums[l] + nums[r];
                if(t == sum) {
                    vector<int> path = {nums[i], nums[l], nums[r]};
                    res.push_back(path);
                    while(l < r && nums[l] == nums[++l]);
                    while(l < r && nums[r] == nums[--r]);
                } else if(t < sum) l++;
                else r--;
            }
        }
        return res;
    }
};

