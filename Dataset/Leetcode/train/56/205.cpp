 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end());
        vector<vector<int>> ans;
        int l=intervals[0][0],r=intervals[0][1];
        int n =intervals.size();
        for(int i = 1;i<n;i++){
            if(l> intervals[i][1]){
                continue;
            }
            else if(r < intervals[i][0]) {
                ans.push_back({l, r});
                l = intervals[i][0];
                r = intervals[i][1];
            }
            else if( r <intervals[i][1]){
                r = intervals[i][1];
            }
        }
        ans.push_back({l, r});
        return ans;
        
    }
};

