 class Solution {
public:
    static bool cmp (vector<int>&a, vector<int>&b){
        if(a[0]==b[0])return a[1]<b[1];
        return a[0]<b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end(),cmp);
        int ans=0;
        vector<vector<int > >res;
        int l=intervals[0][0];
        int t=intervals[0][1];
        for(int i=0; i<intervals.size()-1; i++){
            if(intervals[i+1][0]>t){
                res.push_back({l,t});
                l=intervals[i+1][0];
                t=intervals[i+1][1];
            }else {
                t=max(t,intervals[i+1][1]);
            }
        }
        res.push_back({l,t});
        return res;
    }
};

