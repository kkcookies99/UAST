class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size()==1){
            return intervals;
        }

        std::sort(intervals.begin(), intervals.end(),
          [](const std::vector<int>& a, const std::vector<int>& b) {
            return a[0] < b[0];
        });

        vector<vector<int>> result;
        result.push_back(intervals[0]);
        int curRight = intervals[0][1];
        int cnt=0;

        for(int i=1;i<intervals.size();i++){
            if(intervals[i][0]<=curRight){
                curRight = max(curRight, intervals[i][1]);
                result[cnt][0] = min(result[cnt][0], intervals[i][0]);
                result[cnt][1] = curRight;
            }
            else{
                result.push_back(intervals[i]);
                curRight = intervals[i][1];
                cnt++;
            }
        }

        return result;
    }
};

