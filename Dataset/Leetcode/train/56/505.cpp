 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> ret;
        int n = intervals.size();
        int i =0;
        sort(intervals.begin(),intervals.end());
        while(i<n){
            int a = intervals[i][0];
            int b = intervals[i][1];
            if(i+1<n && b >= intervals[i+1][0] ){
                while((i+1<n && b >= intervals[i+1][0] )){
                    b = max(b,intervals[i+1][1]);
                    i++;
                }
            }
            i++;
            ret.push_back({a,b});
        }

        return ret;
    }
};


