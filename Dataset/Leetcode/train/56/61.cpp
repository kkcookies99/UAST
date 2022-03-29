class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if (intervals.empty()) return {};
        sort(intervals.begin(), intervals.end(), [](const vector<int> &a, const vector<int> &b) {
            return a[0] < b[0];
        });
        vector<vector<int> > ans;
        vector<int> last = std::move(intervals[0]);
        const int N = intervals.size();
        for (int i = 1; i < N; ++i) {
            vector<int> &cur = intervals[i];
            if (cur[0] > last[1]) {
                ans.emplace_back(std::move(last));
                last = std::move(cur);
            } else {
                if (cur[1] > last[1]) last[1] = cur[1];
            }
        }
        ans.emplace_back(std::move(last));
        return ans;
    }
};

