 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end(),[](const vector<int>& a,const vector<int>& b){
            return a[0]==b[0] ? a[1]<b[1]:a[0]<b[0];
        });
        vector<vector<int>>res;
        int n=intervals.size();
        int left=intervals[0][0],right=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=right&&intervals[i][1]>right)right=intervals[i][1];
            else if(intervals[i][0]<=right&&intervals[i][1]<=right)continue;
            else if(intervals[i][0]>right){
                vector<int>temp{left,right};
                res.push_back(temp);
                left=intervals[i][0];
                right=intervals[i][1];
            }
        }
        vector<int>temp{left,right};
        res.push_back(temp);
        return res;
    }
};

