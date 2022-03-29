 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        sort(intervals.begin(),intervals.end());
        vector<int> path=intervals[0];
        int i=1;
        while(i<intervals.size())
        {
            if(intervals[i][0]>path[1]) 
            {
                res.push_back(path);
                path=intervals[i];
                ++i;
                continue;
            }
            else
            {
                path[0]=min(path[0],intervals[i][0]);
                path[1]=max(path[1],intervals[i][1]);
                ++i;
            }
        }
        res.push_back(path);
        return res;
    }
};

