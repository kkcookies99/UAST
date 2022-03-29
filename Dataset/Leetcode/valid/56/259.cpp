 class Solution {
public:
    bool canMerge(int l, int r, int ll, int rr) {
        if (rr < l) return false;
        if (r < ll) return false;
        return true;
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        set<vector<int>> itvls(intervals.begin(), intervals.end());
        set<vector<int>> adds;
        // now 是现在合并的结果
        vector<int> now({(*itvls.begin())[0], (*itvls.begin())[1]});
        for (auto iter = itvls.begin(); iter != itvls.end(); ) {
            // cout << "iter: " << (*iter)[0] << ", " << (*iter)[1] << endl;
            if (canMerge(now[0], now[1], (*iter)[0], (*iter)[1])) {
                now[0] = min(now[0], (*iter)[0]);
                now[1] = max(now[1], (*iter)[1]);
                iter = itvls.erase(iter);
            } else {
                adds.insert(now);
                // cout << "pre_now[0]: " << now[0] << " pre_now[1]: " << now[1] << endl;
                now = *iter;
                // cout << "now[0]: " << now[0] << " now[1]: " << now[1] << endl;
            }
        }
        adds.insert(now);
        vector<vector<int>> ans;
        // cout << "add" << endl;
        for (auto add : adds) {
           itvls.insert(add);
            // cout << add[0] << ", " << add[1] << endl;
        }
        // cout << "itvl" << endl;
        for (auto itvl : itvls) {
            ans.push_back(itvl);
            // cout << itvl[0] << ", " << itvl[1] << endl;
        }
        return ans;
    }
};

