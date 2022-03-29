 class Solution {
public:
    vector<Interval> XXX(vector<Interval>& intervals) {
        vector<Interval> result;
        if (intervals.size() == 0) {
            return result;
        }
        sort(intervals.begin(), intervals.end(),[](Interval& a, Interval& b){
            return a.start < b.start;
        });
        result.push_back(intervals.front());
        for (int i=1; i<intervals.size(); i++) {
            if (intervals[i].start <= result.back().end) {
                result.back().end = max(result.back().end, intervals[i].end);
            }else{
                result.push_back(intervals[i]);
            }
        }
        return result;
    }
};```
