 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        int n = nums.size();
        if (n < 3) return ans;
        sort(nums.begin(),nums.end());
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1, right = n - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    ans.push_back({ nums[i], nums[left], nums[right] });
                    while (left < right && nums[left] == nums[left + 1]) left++; 
                    while (left < right && nums[right] == nums[right - 1]) right--;  
                    left++; right--;
                }
                if (nums[i] + nums[left] + nums[right] < 0)
                    left++;
                if (nums[i] + nums[left] + nums[right] > 0)
                    right--;
            }
        }
        return ans;
    }
};

