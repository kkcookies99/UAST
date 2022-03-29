 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        int n=intervals.size();
        bool XXXd;
        vector<vector<int>> res;
        for(int i=0;i<n;++i){
            XXXd=false;
            int a=intervals[i][0];
            int b=intervals[i][1];
            for(int j=i+1;j<n;++j){
                int c=intervals[j][0];
                int d=intervals[j][1];
                if(a<=d&&c<=b){
                    if(a<c) intervals[j][0]=a;
                    if(b>d) intervals[j][1]=b;
                    XXXd=true;
                    break;
                }
            }
            if(!XXXd){
                res.push_back(intervals[i]);
            }
        }
        return res;
    }
};

