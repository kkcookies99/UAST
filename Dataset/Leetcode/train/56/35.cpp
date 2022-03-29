class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        if (intervals.empty()) return res;
        int n = intervals.size();
        QSort(intervals, 0, n - 1);    // 快排，按照每个元素中第一个数进行排序
        res.emplace_back(intervals[0]);
        for (int i = 1; i < n; i++) {
            int l = intervals[i][0], r = intervals[i][1];
            if (res.back()[1] < l)      // 如果当前i区间的左值大于已经压入res中的区间的右值
                res.emplace_back(intervals[i]); // 直接压入
            else                        // 否则调整合并区间
                res.back()[1] = max(res.back()[1], r);
        }
        return res;
    }

    void QSort(vector<vector<int>>& intervals, int left, int right) {
        if (left < right) {
            int index = getIndex(intervals, left, right);
            QSort(intervals, left, index - 1);
            QSort(intervals, index + 1, right);
        }
    }

    int getIndex(vector<vector<int>>& intervals, int low, int high) {
        // 按照元素中的第一个数字进行排序
        int key = intervals[low][0];
        vector<int> pos = intervals[low];
        while (low < high) {
            // 先从高位开始
            while (low < high && intervals[high][0] >= key) high--;
            intervals[low] = intervals[high];   // 找到高位中比key位小的数移到key左边
            // 由于高位空出，因此再对低位进行搜索
            while (low < high && intervals[low][0] <= key) low++;
            intervals[high] = intervals[low];   // 找到低位中比key大的数填补高位空缺
        }
        // 循环之后，最后空缺的位置即为区分子表的中点
        intervals[low] = pos;
        return low; // 返回索引点
    }
};

