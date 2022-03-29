 class Solution {
public:
  int XXX(string s) {
    unordered_map<char, int> m{{'I', 1}, {'V', 5}, {'X', 10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}};
    char prev = 0;
    int ans = 0;
    for (const auto& c : s) {
      ans += m[c];
      if (prev && m[prev] < m[c])
        ans -= 2 * m[prev];
      prev = c;
    }
    return ans;
  }
};

