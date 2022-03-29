 class Solution {
public:
  vector<vector<int>> XXX(vector<vector<int>>& intervals) {
    std::sort(intervals.begin(), intervals.end(),
      [](const auto& x, const auto& y) { return x.front() < y.front(); });
    auto res = std::vector<std::vector<int>>{intervals.front()};
    for (const auto& cur : intervals) {
      if (auto& end = res.back().back(); cur.front() <= end)
        end = std::max(end, cur.back());
      else
        res.push_back(cur);
    }
    return res;
  }
};

