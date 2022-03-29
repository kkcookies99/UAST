 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end(),[=](vector<int> a,vector<int> b)->bool{return a[0]<b[0];});
        int sta=intervals[0][0],end=intervals[0][1];
        vector<vector<int> > res;
        for(int i=1;i<intervals.size();i++)
        {
            if(end<intervals[i][0])
            {
                res.push_back({sta,end});
                sta=intervals[i][0];
                end=intervals[i][1];
            }
            if(end>intervals[i][1])
                continue;
            if(end>=intervals[i][0])
            {
                end=intervals[i][1];
            }       
        }
        res.push_back({sta,end});
        return res;
    }
};

