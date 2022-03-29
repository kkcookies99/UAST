class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        if(intervals.size() <= 1){
            return intervals;
        }
        //按右端点排序
        sort(intervals.begin(),intervals.end(),[](vector<int>& a,vector<int>& b){
            return a[0] < b[0] || a[0] == b[0] && a[1] < b[1];
        });

        vector<vector<int>> result;
        int preStart = intervals[0][0], preEnd = intervals[0][1];
        for(int i = 1;i < intervals.size();++i){
            if(preEnd >= intervals[i][0]){
                preEnd = max(intervals[i][1],preEnd);
            }else{
                result.push_back({preStart,preEnd});
                preStart = intervals[i][0];
                preEnd = intervals[i][1];
            }
        } 
        result.push_back({preStart,preEnd});
        return result;
    }
};

