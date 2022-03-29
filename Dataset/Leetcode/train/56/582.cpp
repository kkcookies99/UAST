 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<pair<int,int>> pair;
        vector<vector<int>> res;

        if(intervals.empty()) return res;

        for(int i = 0; i < intervals.size(); i++){
            pair.push_back({intervals[i][0], intervals[i][1]});
        }

        sort(pair.begin(), pair.end());

        int st = -2e4, ed = -2e4;
        for(int i = 0; i < pair.size(); i++){
            if(pair[i].first > ed){
                if(st != -2e4) res.push_back({st,ed});
                st = pair[i].first;
                ed = pair[i].second;
            }else{
                ed = max(ed, pair[i].second);
            }
        }

        res.push_back({st,ed});

        return res;
    }
};

