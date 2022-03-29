 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        int len = intervals.size();
        vector<vector<int>> res;
        if(len == 0)
           return res;
        sort(intervals.begin(),intervals.end());
        //1、[[1,10],[4,5],[6,8]]
        //2、[[1,4],[0,4]]     //排序
        //3、[[1,4],[2,3]]     //数组包含
        for(int i = 0 ;i < len-1 ;i++)
        {
            if(intervals[i][1]>=intervals[i+1][0])
               {
                   if(intervals[i][1]>intervals[i+1][1])
                   {
                        intervals[i+1][1] = intervals[i][1];
                        intervals[i+1][0] = intervals[i][0];
                   }
                   else
                   {
                       intervals[i+1][0] = intervals[i][0];
                   }
                        
               }
           else
           {
               res.push_back({intervals[i][0],intervals[i][1]}); 
           }
        }
        res.push_back({intervals[len-1][0],intervals[len-1][1]}); 
        return res;
    }
};

