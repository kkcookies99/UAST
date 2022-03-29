class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        mer(intervals,res);
        return res;

    }
    void mer(vector<vector<int>>& intervals,vector<vector<int>> &res)
    {
        int ed = -2e9,st = -2e9;
        sort(intervals.begin(),intervals.end());
        for(int i=0;i<intervals.size();i++)
        {
            
            if(intervals[i][0]>ed)
            {
                if(st!=-2e9)res.push_back({st,ed});
                st = intervals[i][0];
                ed = intervals[i][1];
            }
            else ed = max(intervals[i][1],ed);
        }
        if(st!=-2e9)res.push_back({st,ed});
    }
};

