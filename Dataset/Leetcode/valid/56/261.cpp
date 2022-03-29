 class Solution {
public:
    static bool cmp(const vector<int>&a,const vector<int>&b){
        if(a[0]!=b[0])
            return a[0]<b[0];
        return b[1]<a[1];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end(),cmp);
        vector<vector<int>>res;
        res.push_back(intervals[0]);
        for(int i=1;i<intervals.size();++i){
            if(intervals[i][0]!=intervals[i-1][0]){
                if(res.back()[1]>=intervals[i][0])
                    res.back()[1]=max(intervals[i][1],res.back()[1]);
                else
                    res.push_back(intervals[i]);
            }
        }return move(res);
    }
};

