 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        sort(intervals.begin(), intervals.end());
        int st = -2e9, ed = -2e9;
        for (auto x : intervals) {
            if (x[0] > ed) {
                if (st != -2e9) res.push_back({st, ed});
                st = x[0], ed = x[1];
            }
            else ed = max(ed, x[1]);
        }
        if (st != -2e9) {
            res.push_back(vector<int>());
            res.back().push_back(st);
            res.back().push_back(ed);
        }
        return res;
    }
};

