 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        int size = intervals.size();
        if(size < 2) return intervals;
        quickSort(intervals, 0, size - 1);
        vector<vector<int>> res = {};
        int left = 0, right = 1;
        while(left < size) {
            // 最后一个元素
            if(left == size-1) {
                res.push_back(intervals[left]);
                break;
            }
            if(intervals[left][1] < intervals[right][0]) {
                // 不需要合并
                res.push_back(intervals[left]);
            }else {
                // 此时需要合并，合并后的结果保存到right
                intervals[right][0] = intervals[left][0];
                intervals[right][1] = max(intervals[left][1], intervals[right][1]);
            }
            left++;
            right++;
        }
        return res;
    }

    void quickSort(vector<vector<int>>& intervals, int left, int right) {
        if(left < right) {
            int pilot = partition(intervals, left, right);
            quickSort(intervals, left, pilot - 1);
            quickSort(intervals, pilot + 1, right);
        }
    }

    int partition(vector<vector<int>>& intervals, int left, int right) {
        vector<int> pilotValue = intervals[left];
        while(left < right) {
            while(left < right && intervals[right][0] >= pilotValue[0]) --right;
            intervals[left] = intervals[right];
            while(left < right && intervals[left][0] <= pilotValue[0]) ++left;
            intervals[right] = intervals[left];
        }
        intervals[left] = pilotValue;
        return left;
    }
    int max(int a, int b) {
        return a > b ? a : b;
    }
};

