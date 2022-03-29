 class Solution {
public:

    static bool less(vector<int> a, vector<int> b) {
        return a[0] < b[0];
    }

    vector<vector<int>> XXX(vector<vector<int>> &intervals) {
        sort(intervals.begin(), intervals.end(), less);
        vector<vector<int>> result;
        for (auto it = intervals.begin(); it != intervals.end() - 1; it++) {
            if ((*it)[1] >= (*(it + 1))[0]) {
                (*(it + 1))[0] = (*(it))[0];
                (*(it + 1))[1] = max((*(it + 1))[1], (*(it))[1]);
            } else result.push_back(*it);
        }
        result.push_back(intervals.back());
        return result;
    }
};

