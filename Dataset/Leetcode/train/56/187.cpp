 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> vec;
        for (unsigned int i = 0; i < intervals.size(); ++i) {
            for (int j = 0; j < intervals.size(); ++j) {
                if (intervals[i][0] < intervals[j][0]) {
                    vector<int> tmp = intervals[i];
                    intervals[i] = intervals[j];
                    intervals[j] = tmp;
                }
            }
        }
        for (int i = 0; i < intervals.size(); i++) {
            cout << "[" << intervals[i][0] << "," << intervals[i][1] << "],"; 
        }

        for (int k = 0; k < intervals.size(); ++k) {
            bool isAdd = true;
            for (int i = 0; i < vec.size(); ++i) {
                if (intervals[k][0] >= vec[i][0] && intervals[k][0] <= vec[i][1]) {
                    isAdd = false;
                    if (intervals[k][1] > vec[i][1]) {
                        vec[i][1] = intervals[k][1];
                        break;
                    }
                }
            }
            if (isAdd) {
                vec.push_back(intervals[k]);
            }
        }
        return vec;
    }
};

