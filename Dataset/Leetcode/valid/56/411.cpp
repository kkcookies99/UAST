 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> result;
        int intervals_size = intervals.size();
        if(intervals_size == 0) return result; 
        sort(intervals.begin(), intervals.end());

        // 此处先放置一个区间
        result.push_back(intervals[0]);
        for(int i = 1, j = 0; i < intervals_size; i++) {
            if(result[j][1] >= intervals[i][0]) {    // 如果能合并
                result[j][1] = max(result[j][1], intervals[i][1]);
            } else {  // 不能合并
                result.push_back({intervals[i][0], intervals[i][1]});
                ++j;
            }
        }
        
        return result;

    }
};

