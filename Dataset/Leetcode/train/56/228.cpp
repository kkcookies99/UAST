 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        sort(intervals.begin(),intervals.end());
        for(int i=0;i<intervals.size();){
            int j=i+1,tmp=intervals[i][1];
            while(j<intervals.size() && tmp>=intervals[j][0]){
                tmp=max(tmp,intervals[j][1]);
                ++j;
            }
            res.push_back({intervals[i][0],tmp});
            i=j;
        }
        return res;
    }
};

