 class Solution {
public:
    static bool cmp(const vector<int>& a,const vector<int>& b){return a[0]<b[0];}
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ans;
        if (intervals.size()==0) return ans;
        sort(intervals.begin(),intervals.end(),cmp);
        int l=intervals[0][0],r=intervals[0][1];
        for (int i=1;i<intervals.size();i++)
        {
            if (r>=intervals[i][0]&&r<intervals[i][1]) r=intervals[i][1];
            else 
            if (r<intervals[i][0]) {
                ans.push_back({l,r});
                l=intervals[i][0];
                r=intervals[i][1];
            }
        }
        ans.push_back({l,r});
        return ans;
    }
};

