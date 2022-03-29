 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end(), 
            [](vector<int> v1, vector<int> v2)
            {
                return v1[0] < v2[0];
            });

        int index = 0;
        int len = intervals.size();
        int begin = intervals[index][0];
        int end = intervals[index][1];

        vector<vector<int>> res;
        
        while (index < len)
        {
            begin = intervals[index][0];
            end = intervals[index][1];

            while (index + 1 < len && end >= intervals[index + 1][0])
            {
                if (end < intervals[index + 1][1])// 1 4 2 6的情况-> 1 6
                {
                    end = intervals[index + 1][1];
                    index++;
                }
                else if (end >= intervals[index + 1][1])//1 4 2 3的情况-> 1 4
                {
                    index++;
                }
            }

            vector<int> v(2);
            v[0] = begin; v[1] = end;
            res.push_back(v);
            index++;
        }
        return res;
    }
};

