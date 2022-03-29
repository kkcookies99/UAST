class Solution {
public:
  // 位运算解法
  vector<vector<int>> XXX(vector<int>& nums) {
    const int n = nums.size();
    vector<vector<int>> ans;
    for (int s = 0; s < 1 << n; ++s) {
      vector<int> cur;
      for (int i = 0; i < n; ++i)
        if (s & 1 << i) cur.emplace_back(nums[i]);
      ans.emplace_back(cur);
    }
    return ans;
  }

  // 算法1: 递归求组合数
  vector<vector<int>> XXXII(vector<int>& nums) {
    vector<vector<int>> ans;
    vector<int> candidates;
    function<void(int)> dfs = [&](int pos) {
      ans.emplace_back(candidates);
      for (int i = pos; i < nums.size(); ++i) {
        candidates.emplace_back(nums[i]);
        dfs(i + 1);
        candidates.pop_back();
      }
    };
    dfs(0);
    return ans;
  }

  // 算法2: 递归求组合数
  vector<vector<int>> XXXIII(vector<int>& nums) {
    vector<int> candidates;
    vector<vector<int>> ans;

    function<void(int, int)> backtracking = [&](int p, int n) {
      if (p == n)
        return ans.push_back(candidates);

      for (int i = p; i < nums.size(); ++i) {
        candidates.emplace_back(nums[i]);
        backtracking(i + 1, n);
        candidates.pop_back();
      }
    };

    for (int i = 0; i <= nums.size(); ++i) 
      backtracking(0, i);

    return ans;
  }  
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


