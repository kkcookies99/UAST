 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        for(int i=0; i<intervals.size(); ++i)
        {
            if(intervals[i][0] == -9999)
                continue;
            for(int j=i+1; j<intervals.size(); ++j)
            {
                if(intervals[j][0] == -9999)
                    continue;
                if((intervals[i][0] <= intervals[j][1] && intervals[i][0] >= intervals[j][0])
                || (intervals[i][1] <= intervals[j][1] && intervals[i][1] >= intervals[j][0])
                || (intervals[i][1] >= intervals[j][1] && intervals[i][0] <= intervals[j][0]))
                {
                    intervals[i][0] = min(intervals[i][0], intervals[j][0]);
                    intervals[i][1] = max(intervals[i][1], intervals[j][1]);
                    intervals[j][0] = -9999;
                    j = i;
                }
            }
            res.push_back(intervals[i]);
        }
        return res;
    }
};

