 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size() == 0){
            return intervals;
        }
        // 首先遍历一遍，给区间的left进行索引并且排序，然后
        std::map<int, int> left_index_map; // 第一个是索引
        int i = 0;
        for(auto interval : intervals) {
            int left = interval[0];
            int right = interval[1];
            if (left_index_map.count(left)) {
                int max_right = left_index_map[left];
                if (right > max_right) {
                    left_index_map[left] = right;
                } 
            } else {
                left_index_map[left] = right;
            }
            i++;
        }
        // 第一次遍历给left 都找好了最远的索引
        vector<int> left_index;
        for (auto pair : left_index_map) {
            left_index.push_back(pair.first);
        }
        vector<int> tmp = {left_index[0], left_index_map[left_index[0]]};
        vector<vector<int>> result;
        for (int i = 1; i < left_index.size(); i++) {
            int left = left_index[i];
            int right = left_index_map[left];

            int before_left = tmp[0];
            int before_right = tmp[1];
            if (before_right >= left) {
                tmp[1] = right;
                if (before_right > right) {
                    tmp[1] = before_right;
                }
            } else {
                result.push_back(tmp);
                tmp = {left_index[i], left_index_map[left_index[i]]};
            }
        }
        result.push_back(tmp);
        return result;
    }
};

