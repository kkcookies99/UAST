 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> new_vector;
        sort(intervals.begin(), intervals.end(), [](vector<int> v1, vector<int> v2) -> bool {if (v1[0] == v2[0]) return v1[1] <= v2[1]; else return v1[0] <= v2[0];}); // 就是这里的lambda表达式
        new_vector.push_back(intervals[0]);
        int index = 1;
        while (index < intervals.size()){
            if (new_vector.back()[1] >= intervals[index][0])
                new_vector.back()[1] = max(intervals[index][1], new_vector.back()[1]);
            else
                new_vector.push_back(intervals[index]);
            ++index;
        }
        return new_vector;
    }
};

