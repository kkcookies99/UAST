 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;

        if(intervals.empty()) return res;

        sort(intervals.begin(), intervals.end());

        int st = -2e4, ed = -2e4;
        for(int i = 0; i < intervals.size(); i++){
            if(intervals[i][0] > ed){
                if(st != -2e4) res.push_back({st,ed});
                st = intervals[i][0];
                ed = intervals[i][1];
            }else{
                ed = max(ed, intervals[i][1]);
            }
        }

        res.push_back({st,ed});

        return res;
    }
};

