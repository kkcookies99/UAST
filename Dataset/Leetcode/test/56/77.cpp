class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> XXXd;
        int n = intervals.size();

        // 需要先排序
        sort(intervals.begin(), intervals.end(), [](auto &a, auto &b) {
            return a[0] < b[0];
        });

        for (int i = 0; i < n;) {
            int j = i;
            int _max = intervals[i][1];
            // 向右找尽可能多的可以合并的区间
            // 此处从本身出发，至少会执行一次
            while (j < n && intervals[j][0] <= _max) {
                _max = max(_max, intervals[j][1]);
                j++;
            }
            // 添加合并后的区间，更新 i 的值
            XXXd.push_back(vector<int>{intervals[i][0], _max});
            i = j;
        }

        return XXXd;
    }
};

