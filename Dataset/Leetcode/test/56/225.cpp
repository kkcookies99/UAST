 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if (!intervals.size()) {
            return {};
        }
        vector<vector<int>> ret;
        sort(intervals.begin(), intervals.end(), 
        [](const vector<int>& a, const vector<int>& b)->bool {
            return a[0] < b[0] || a[0] == b[0] && a[1] < b[1];
        });
        vector<int> ans({intervals[0][0], intervals[0][1]});
        for (auto it = intervals.begin() + 1; it < intervals.end(); it++) {
            if (ans[1] >= (*it)[0]) {
                if (ans[1] < (*it)[1])
                    ans[1] = (*it)[1];
            } else {
                ret.push_back(ans);
                ans[0] = (*it)[0];
                ans[1] = (*it)[1];
            }
        }
        ret.push_back(ans);
        return ret;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


