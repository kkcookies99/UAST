 class Solution {
public:
    vector<string> XXX(int n) {
        vector<vector<string> >  tab(n+1,vector<string>());
        tab[0].push_back("");
        tab[1].push_back("()");
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++)
                for(auto it:tab[j])
                    for(auto jt:tab[i-1-j])
                        tab[i].push_back(it+'('+jt+')');                      
        }
        return tab[n];
    }
};

