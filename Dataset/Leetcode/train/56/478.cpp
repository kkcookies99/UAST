 class Solution {
public:
    static bool cmp(vector<int>& a, vector<int>& b) {
        if (a[0] != b[0]) return a[0] < b[0];
        else return a[1] < b[1];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> result;
        if (intervals.size() == 0) return result;
        sort(intervals.begin(), intervals.end(), cmp);
        for (int i = 0; i < intervals.size(); i++) {
            if (i + 1 < intervals.size() && intervals[i][1] >= intervals[i + 1][0]) {
                int j = i;
                int k = j + 1;
                int m= intervals[j][0], n = intervals[j][1];
                while (k < intervals.size() && n >= intervals[k][0]) {
                    m = m > intervals[k][0] ? intervals[k][0] : m;
                    n = n > intervals[k][1] ? n : intervals[k][1];
                    j++;
                    k++;
                }
                vector<int> temp = { m,n };
                result.push_back(temp);
                i = j;
            }
            else {
                result.push_back(intervals[i]);
            }
        }
        return result;
    }
};

