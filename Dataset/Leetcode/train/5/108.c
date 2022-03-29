 #define ri register int

size_t str_len(const char * s) {
  assert(s);
  if (!*s) return 0;

  const char* p = s;
  while (*++p);

  return p - s;
}

// 解题思路 --  DP
// dp[i][j]代表的状态为: 字符串s中[i, j]区间的子串是否是一个回文串(palindromic)
// 因此状态转移方程为:
// s[i] == s[j] && dp[i + 1][j - 1] == true
char * XXX(char * s) {
  const int n = str_len(s);

  int dp[n][n];
  for (ri i = 0; i < n; ++i) dp[i][i] = 1;

  int start = 0, len = 1;
  for (int j = 1; j < n; ++j)
    for (int i = 0; i < j; ++i) {
      // DP 的核心 -- 状态转移方程
      *(*(dp + i) + j) = i + 1 == j ? s[i] == s[j] : s[i] == s[j] && dp[i + 1][j - 1];
      if (*(*(dp + i) + j)) {
        if (j - i + 1 > len) {
          len = j - i + 1;
          start = i;
        }
      }
    }

  char* ans = (char*) calloc(n + 1, sizeof(char));
  strncat(ans, s + start, len);
  return ans;
}

