 class Solution {
public:
    char s[100];
    vector<string> v;
    vector<string> XXX(int n) {
        dfs(0,0,0,n);
        return v;
    }
    void dfs(int i,int l,int r,int n){
        if(r>l||l>n) return;
        if(i==2*n){
            v.push_back(s);
            return ;
        }
        s[i]='(';
        dfs(i+1,l+1,r,n);
        s[i]=')';
        dfs(i+1,l,r+1,n);
    }
};

