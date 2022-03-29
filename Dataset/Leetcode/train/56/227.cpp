 class Solution {
public:
    struct cmp {
        bool operator() (vector<int> &a, vector<int> &b){
            return a[0] < b[0];
        }
    };
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        int sz = intervals.size();
        if (sz == 0) {
            return {};
        }
        vector<vector<int>> res;
        vector<int> last;
        sort(intervals.begin(), intervals.end(), cmp());
        res.emplace_back(intervals[0]);
        for (int i=1; i<sz; i++) {
            last = res.back();
            if (intervals[i][0] <= last[1]) {
                res.back()[1] = max(intervals[i][1], last[1]);
            } else {
                res.emplace_back(intervals[i]);
            }
        }
        return res;
    }
};

