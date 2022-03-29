 class Solution {
public:
  vector<vector<int>> XXX(vector<int>& nums) {
    sort(begin(nums), end(nums));
    const int n = nums.size();
    vector<vector<int>> ans;
    for (int i = 0; i < n; ++i) {
      if (i && nums[i] == nums[i - 1]) continue;
      int j = i + 1, k = n - 1;
      while (j < k) {
        if (nums[j] + nums[k] < -nums[i]) ++j;
        else if (nums[j] + nums[k] > -nums[i]) --k;
        else {
          ans.push_back({nums[i], nums[j], nums[k]});
          while (j < k - 1 && nums[j] == nums[j + 1]) ++j;
          while (j < k - 1 && nums[k] == nums[k - 1]) --k;
          ++j, --k;
        }
      }
    }
    return ans;
  }
};

