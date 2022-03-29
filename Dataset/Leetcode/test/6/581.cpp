 class Solution {
public:
  string XXX(string s, int numRows) {
    // corner case
    if (s.length() < numRows || numRows == 1) return s;

    vector<string> strs(numRows);
    int cur = 0, d = -1;
    for (const auto& c : s) {
      if (cur == 0 || cur == numRows - 1) d = -d;
      strs[cur].push_back(c);
      cur += d;
    }

    string ans;
    for (const auto& str : strs)
      ans += str;
  
    return ans;
  }
};

