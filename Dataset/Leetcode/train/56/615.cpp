 class Solution {
public:
    static bool cmp(vector<int> a, vector<int> b)
    {
        return a[0] < b[0] || (a[0] == b[0] && a[1] < b[1]);
    }

    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if (intervals.empty() || intervals[0].empty()) return intervals;

        vector<vector<int>> res;

        sort(intervals.begin(), intervals.end(), cmp);

        int left_border = intervals[0][0], right_border = intervals[0][1];
        for (int i = 1; i < intervals.size(); i ++)
        {
            int left = intervals[i][0], right = intervals[i][1];
            if (right_border < right && right_border >= left) right_border = right;
            else if (right_border < right && right_border < left)
            {
                res.push_back({left_border, right_border});
                left_border = left, right_border = right;
            }
        }

        res.push_back({left_border, right_border});

        return res;
    }
};

