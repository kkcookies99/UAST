class Solution {
public:
    //先排个序，然后扫一遍即可
    static int cmp(const vector<int> &a,const vector<int> &b){
        if(a[0]==b[0])
            return a[1]<b[1];
        return a[0]<b[0];
    }
    vector<vector<int>> XXX(vector<vector<int>>& inter) {
        sort(inter.begin(),inter.end(),cmp);
        int i,j;
        vector<vector<int>> res;
        i=0;
        while(i<inter.size()){
            int s=inter[i][0],t=inter[i][1];
            j=i+1;
            while(j<inter.size() && inter[j][0]<=t){
                t=max(t,inter[j][1]);j++;
            }
            res.push_back(vector<int>{s,t});
            if(j>=inter.size())
                break;
            i=j;
        }
        return res;
    }
};

