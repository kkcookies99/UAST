 class Solution {
public:
    set<string>sub;
    string s="()";
    void Create(int now,string t,int &n)
    {
        if (sub.find(t)!=sub.end())
            return ;
        if (now>=n)
        {
            sub.insert(t);
            return ;
        }
        string p=t;
        for(int i=0;i<=p.size();i++)
        {
            t=t.insert(i,s);
            Create(now+1,t,n);
            t=p;
        }
    }
    vector<string> XXX(int n) {
        vector<string>p;
        if (n==0)   return p;
        Create(0,"",n);
        for(auto i : sub)
        {
            p.push_back(i);
        }
        return p;
    }
};

