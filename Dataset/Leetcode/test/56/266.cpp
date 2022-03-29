 class Solution {
public:
    // 根据区间起点升序
    static bool cmp(vector<int> &a, vector<int> &b){
        if (a[0]==b[0])
            return a[1] < b[1];
        return a[0] < b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if (intervals.size() == 0) return {};
        sort(intervals.begin(), intervals.end(), cmp);  // 保证区间交叉只会出现在相邻2个区间之间
        vector<vector<int>> res;
        int back = -1; // 起点最大的区间指针
        for (int i = 0; i < intervals.size(); i++) {
            if (back == -1 || res[back][1] < intervals[i][0]) { // 区间不交叉
                res.push_back(intervals[i]); // 加入结果集
                back++;
            } else { // 区间交叉
                res[back][1] = max(intervals[i][1], res[back][1]); // 修改区间下限
            }
        }
        return res;
    }
};

