class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end());

        vector<vector<int>> ret;
        for (auto &i : intervals) {
            if (ret.empty() || i[0] > ret.back()[1]) ret.push_back(i);
            else ret.back()[1] = max(i[1], ret.back()[1]);
        }
        return ret;
    }
};

