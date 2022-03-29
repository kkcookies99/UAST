 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        if (intervals.size() < 2) return intervals;
        sort(intervals.begin(), intervals.end());
        for (int i = 1; i < intervals.size(); i ++) {
            if (intervals[i][0] > intervals[i - 1][1]) {
                //当前的i与i-1区间已经隔离，i-1加入结果集
                res.push_back(intervals[i - 1]);
            } else {
                //当前i与i-1区间有重合，重新定义当前区间，作为下一次循环的i-1区间继续做对比，知道发生隔离
                intervals[i][0] = min(intervals[i][0], intervals[i - 1][0]);
                intervals[i][1] = max(intervals[i][1], intervals[i - 1][1]);
            }
            //循环到最后一个元素，经过上面的循环已经把i- 1加入到了结果，但是没合并的i或者已经合并了的i都还未加入
            if (i == intervals.size() - 1) {
                    res.push_back(intervals[i]);
            }
        }

        return res;
    }
};

