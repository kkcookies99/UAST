 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        int len=intervals.size();
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> res;
        res.push_back(intervals[0]);
        for(int i=1;i<len;++i)
        {

           if(intervals[i][0]>res[res.size()-1][1])
                res.push_back(intervals[i]);
           else
                res[res.size()-1][1]=max(intervals[i][1], res[res.size()-1][1]);
        }
        return res;
    }
};

