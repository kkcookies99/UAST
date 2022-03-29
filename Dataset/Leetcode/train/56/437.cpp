 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        priority_queue<int, vector<int>, greater<int>> start_points;
        priority_queue<int, vector<int>, greater<int>> end_points;

        for (int i = 0; i < intervals.size(); i++) {
            start_points.push(intervals[i][0]);
            end_points.push(intervals[i][1]);
        }

        vector<vector<int>> result;
        int start_point = start_points.top();
        int left, right;
        start_points.pop();
        
        while (!start_points.empty()) {
            left = start_points.top();
            right = end_points.top();
            
            if (left > right) {
                result.push_back({start_point, right});
                start_point = left;
            }

            start_points.pop();
            end_points.pop();
        }

        while (!end_points.empty()) {
            right = end_points.top();
            end_points.pop();
        }
        result.push_back({start_point, right});

        return result;
    }
};

