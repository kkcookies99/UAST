 class Solution {
public:
    vector<string> XXX(int n) {
       vector<string>res;
       vector<string> temp;
        if(n==0) return res;
        else if(n==1)
            res.push_back("()");
        if(res.size()==0) res.push_back("()");
        string s="";
        for(int i=2;i<=n;i++)
        {
            temp=res;
            res.clear();
            for(int j=0;j<temp.size();j++)
            {
                for(int k=0;k<temp[j].size();k++)
                {    s=temp[j].substr(0,k+1)+"()"+temp[j].substr(k+1,temp[j].size()-k-1);
                    res.push_back(s);
                }
            }
            set<string> st(res.begin(),res.end());
            res.assign(st.begin(),st.end());  
        }
        return res;
    }
};
```有优化意见的或者不懂的可以一起交流呀
