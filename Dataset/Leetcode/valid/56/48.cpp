class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end(), [](const vector<int>& a, const vector<int>& b)
        {
            if(a[0] == b[0]) return a[0] > b[0];
            return a[0] < b[0];
        });
        vector<vector<int>> v;
        int first = intervals[0][0];
        int second = intervals[0][1];
        for(auto interval : intervals)
        {
            if(interval[0] > second)
            {
                v.push_back({first, second});
                first = interval[0];
                second = interval[1];
            }
            else if(interval[0] <= second && interval[1] > second)
            {
                second = interval[1];
            }
        }
        v.push_back({first, second});
        return v;
    }
};

