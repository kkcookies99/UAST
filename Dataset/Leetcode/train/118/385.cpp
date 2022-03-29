 class Solution {
public:
    vector<vector<int>> XXX(int n) {
        vector<vector<int>> res;
        if(!n) return res;
        vector<int> lev;
        lev.push_back(1);
        //res.push_back(lev);
        for(int i=1;i<=n;i++)
        {
            vector<int> nelv;
            for(int j=0;j<i;j++)
            {
                if(!j) nelv.push_back(lev[j]);
                else if(j == lev.size()) nelv.push_back(lev[j - 1]);
                else nelv.push_back(lev[j-1] + lev[j]);
            }
            lev = nelv;
            res.push_back(nelv);
        }
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


