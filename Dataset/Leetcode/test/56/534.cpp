 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>> &intervals)
    {
        int len = intervals.size();
        if (len == 0) {
            return {};
        }

        sort(intervals.begin(), intervals.end());

        vector<vector<int>> res = {{intervals[0][0], intervals[0][1]}};
        for (int i = 1; i < len; ++i) {
            auto &backT = res.back()[1];
            auto &now = intervals[i];
            if (now[1] <= backT) {
                continue;
            }
            if (now[0] <= backT) {
                backT = now[1];
                continue;
            }
            res.push_back({now[0], now[1]});
        }

        return res;
    }
};

