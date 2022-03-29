 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        // 排序加双指针,时间复杂度O(n^2)
        sort(nums.begin(), nums.end());
        vector<vector<int>> ans;
        for (int i = 0; i < nums.size(); i++){
            int l = i+1, r = nums.size()-1;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            while (l < r){
                if (l > i+1 && nums[l] == nums[l-1]) l++;
                else if (r < nums.size()-1 && nums[r] == nums[r+1]) r--;
                else if (nums[i] + nums[l] + nums[r] == 0) ans.push_back({nums[i], nums[l], nums[r]}), l++, r--;
                else if (nums[i] + nums[l] + nums[r] > 0) r--;
                else l++;
            }
        }
        return ans;
    }
};

