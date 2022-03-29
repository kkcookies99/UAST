 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> points;
        for(auto& i : intervals) {
            points.push_back({1, i[0]});
            points.push_back({-1, i[1]});
        }

        sort(points.begin(), points.end(), [&](vector<int>& v1, vector<int>& v2) {
            if(v1[1] == v2[1]) return v1[0] > v2[0];
            return v1[1] < v2[1];
        });

        vector<vector<int>> res;
        multiset<int> ms;
        for(auto& p : points) {
            if(p[0] == 1) ms.insert(p[1]); 
            else {
                int start = *ms.begin();
                ms.erase(prev(ms.end()));
                if(ms.empty()) {
                    res.push_back({start, p[1]});
                }
            }
        }
        return res;
    }
};

