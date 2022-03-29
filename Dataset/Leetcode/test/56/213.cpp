 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end());
        vector<vector<int>> res;
        for (const auto& v : intervals) {
            if (res.empty() || res.back()[1] < v[0])
                res.emplace_back(v);
            else
                res.back()[1] = max(res.back()[1], v[1]);
        }
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


