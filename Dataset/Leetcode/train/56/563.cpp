 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& intervals) {
        vector<vector<int>> res;
        int dot[10001]={0};
        int inv[10000]={0};
        int L=10000,R=0;
        for(int i=0;i<intervals.size();i++){
            for(int j=intervals[i][0];j<=intervals[i][1];j++){
                dot[j]=1;
                if(j!=intervals[i][1]){
                    inv[j]=1;
                }
                if(j<L) L=j;
                if(j>R) R=j;
            }
        }
        vector<int> tmp;
        for(int i=L;i<=R;i++){
            if(i>0 && dot[i]==1 && inv[i-1]==0 || i==0 && dot[i]==1){
                tmp.push_back(i);
            }
            if(i<10000 && dot[i]==1 && inv[i]==0 || i==10000 && dot[i]==1){
                tmp.push_back(i);
                res.push_back(tmp);
                tmp.pop_back();
                tmp.pop_back();
            }
        }
        return res;
    }
};


