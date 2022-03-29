 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ret;
        vector<int> t(2);
        sort(intervals.begin(),intervals.end());
        for(auto &i:intervals)
        {
            if(&i==&intervals.front())
            {
                t[0]=intervals[0][0];
                t[1]=intervals[0][1];
            }      
            if(i[0]<=t[1])
            {
                if(i[0]<t[0])
                    t[0]=i[0];
               if(i[1]>t[1])
                    t[1]=i[1];
            }
            else
            {
                ret.push_back(t);
                t[0]=i[0];
                t[1]=i[1];
            } 
            if(&i==&intervals.back())
                ret.push_back(t);
        }
        return ret;
    }
};

