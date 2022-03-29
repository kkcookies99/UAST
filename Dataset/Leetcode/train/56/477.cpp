 class Solution {
public:
  vector<vector<int>> XXX(vector<vector<int>>& intervals) {
    
    sort(begin(intervals), end(intervals), [](const auto& a, const auto& b) {
      return a.front() < b.front();
    });

    vector<vector<int>> ans;
    for (const auto& interval : intervals) {
      if (ans.empty() || interval.front() > ans.back().back())
        ans.emplace_back(interval);
      else
        ans.back().back() = max(ans.back().back(), interval.back());
    }

    return ans;
  }
};

