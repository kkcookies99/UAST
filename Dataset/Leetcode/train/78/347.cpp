class Solution {
public:
  // 回溯
  // Time Complexity: O(2^n)
  vector<vector<int>> XXX(vector<int>& nums) {
    
    vector<vector<int>> ans;
    vector<int> cur;

    function<void(int)> dfs = [&](int p) {
      ans.emplace_back(cur);
      for (int i = p; i < nums.size(); ++i) {
        cur.emplace_back(nums[i]);
        dfs(i + 1);
        cur.pop_back();
      }
    };

    dfs(0);
    return ans;
  }

  // 全组合+回溯
  // Time Complexity: O(2^n)
  vector<vector<int>> XXXII(vector<int>& nums) {

    vector<vector<int>> ans;
    vector<int> cur;

    function<void(int, int)> dfs = [&](int p, int n) {
      if (cur.size() == n)
        return ans.push_back(cur);

      for (int i = p; i < nums.size(); ++i) {
        cur.emplace_back(nums[i]);
        dfs(i + 1, n);
        cur.pop_back();
      }
    };

    for (int i = 0; i <= nums.size(); ++i)
      dfs(0, i);

    return ans;
  }

  // Bit Operation
  // Time Complexity: O(2^n)
  vector<vector<int>> XXXIII(vector<int>& nums) {
    const int n = nums.size();
    vector<vector<int>> ans;
    for (int s = 0; s < 1 << n; ++s) {
      vector<int> v;
      for (int i = 0; i < n; ++i)
        if (s & 1 << i) v.emplace_back(nums[i]);
      ans.emplace_back(v);
    }
    return ans;
  }
};

