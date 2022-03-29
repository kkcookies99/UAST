 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end(),[](vector<int>&A,vector<int>&B){
            return A[0]<B[0];
        });
        vector<vector<int>> result;
        vector<int> res={intervals[0][0],intervals[0][1]};
        for(int i=0;i<intervals.size();i++){
            if(res[1]<intervals[i][0]){
                result.push_back(res);
                res[0]=intervals[i][0];
                res[1]=intervals[i][1];
            }
            else
                res[1]=max(res[1],intervals[i][1]);

        }
        result.push_back(res);
        return result;

    }
};

