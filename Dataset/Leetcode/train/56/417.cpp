 class Solution {
public:

    static bool cmp(const vector<int>& a, const vector<int>& b){
        return a[0] < b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(), intervals.end(), cmp);
        vector<int> cur = intervals[0];
        vector<vector<int>> res;
        int i =1;
        while(i<intervals.size()){
            if(cur[1] >= intervals[i][0]){
                //有重叠
                if(intervals[i][1] > cur[1]){
                    //取max右
                    cur[1] = intervals[i][1];
                }
                i++;
            }else{
                res.push_back(cur);
                cur = intervals[i];    
                i++;
            }
        }

        res.push_back(cur);

        return res;
    }
};

