 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        for(int i=0; i<intervals.size(); ++i)
        {
            if(intervals[i][0] == -9999)
                continue;
            auto tmp = &intervals[i];
            for(int j=i+1; j<intervals.size(); ++j)
            {
                if(intervals[j][0] == -9999)
                    continue;
                if(((*tmp)[0] <= intervals[j][1] && (*tmp)[0] >= intervals[j][0])
                || ((*tmp)[1] <= intervals[j][1] && (*tmp)[1] >= intervals[j][0])
                || ((*tmp)[1] >= intervals[j][1] && (*tmp)[0] <= intervals[j][0]))
                {
                    intervals[j][0] = min((*tmp)[0], intervals[j][0]);
                    intervals[j][1] = max((*tmp)[1], intervals[j][1]);
                    (*tmp)[0] = -9999;
                    tmp = &intervals[j];
                }
            }
        }
        for(auto& tmp : intervals)
            if(tmp[0] != -9999)
                res.push_back(tmp);
        return res;
    }
};

