 class Solution {
public:
  // Time Complexity: O(2^N)
  vector<string> XXX(int n) {
    vector<string> ans;
    string cur;
    generate(n, 0, 0, cur, ans);
    return ans;
  }

private:
  void generate(int n, int l, int r, string& cur, vector<string>& ans) {
    if (cur.length() == n << 1)
      return ans.push_back(cur);

    if (l < n) {
      cur.push_back('(');
      generate(n, l + 1, r, cur, ans);
      cur.pop_back();
    }

    if (r < l) {
      cur.push_back(')');
      generate(n, l, r + 1, cur, ans);
      cur.pop_back();
    }
  }
};

