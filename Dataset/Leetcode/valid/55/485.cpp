 class Solution {
public:
  // DP (Bottom-Up)
  bool XXX(vector<int>& nums) {
    const int n = nums.size();
    vector<int> dp(n, UNKNOWN);
    dp[n - 1] = PASS; // 终点肯定能到达终点
    for (int i = n - 2; i >= 0; --i) {
      bool flag = false;
      for (int j = i + 1; j <= min(i + nums[i], n - 1); ++j)
        if (dp[j] == PASS) {
          flag = true;
          break;
        }
      dp[i] = flag ? PASS : NOT_PASS;
    }
    
    return dp.front() == PASS;
  }

  // Recursion With Memorization (Top-Down)
  bool XXXII(vector<int>& nums) {
    const int n = nums.size();
    vector<State> memo(n, UNKNOWN);
    return XXX(nums, n, 0, memo);
  }

private:
  enum State { UNKNOWN, PASS, NOT_PASS };

  bool XXX(vector<int>& nums, int n, int p, vector<State>& memo) {
    if (p == n - 1) return true;
    if (memo[p] != UNKNOWN)
      return memo[p] == PASS;
    
    for (int i = p + 1; i <= min(p + nums[p], n - 1); ++i)
      if (XXX(nums, n, i, memo)) {
        memo[p] = PASS;
        return true;
      }

    memo[p] = NOT_PASS;
    return false;
  }
};

