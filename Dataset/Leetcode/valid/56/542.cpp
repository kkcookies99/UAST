 class Solution {
public:
    vector<vector<int>> XXX(vector<vector<int>>& gaps) {
        sort(gaps.begin(),gaps.end());
        vector<vector<int>> res;
        int cur,l,r;
        for(int i=0;i<gaps.size();i++)
        {
            cur = i;
            l = gaps[i][0];
            r = gaps[i][1];
            //cout<<l<<' '<<r<<' '<<endl;
            while(r >= gaps[cur][0]){
                r = max(r,gaps[cur][1]);
                cur++;
                if(cur == gaps.size()) break;
            }
            i = cur - 1;
            //cout<<cur<<endl;
            vector<int> tmp;
            tmp.push_back(l);tmp.push_back(r);
            res.push_back(tmp);
        }
        return res;
    }
};

