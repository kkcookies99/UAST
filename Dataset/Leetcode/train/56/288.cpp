 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int> >ans;
        sort(intervals.begin(),intervals.end(),[](vector<int>&a,vector<int>&b){return a[1]<b[1];});
        for(int i=intervals.size()-1;i>0;--i)
        {
            int pre=i-1;
            int &l=intervals[i][0],&r=intervals[i][1];
            int &pl=intervals[pre][0],&pr=intervals[pre][1];
            //cout<<l<<'#'<<r<<' '<<pl<<'#'<<pr<<endl;
            if(pr<l)ans.push_back(intervals[i]);
            else
            {
                pl=min(l,pl);
                pr=r;
            }
        }
        ans.push_back(intervals[0]);
        return ans;
    }
};

