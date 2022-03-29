 class Solution {
public:
    vector<string> res;
    vector<string> XXX(int n) {
        string s;
        dfs(s,0,0,n);
        return res;
    }
    void dfs(string s, int numleft, int numright,int n){
        if(numright > numleft || numleft > n || numright > n) return;
        if(s.size() == 2 * n && numleft == numright){
            res.push_back(s);
            return;
        }
        dfs(s + '(', numleft + 1, numright, n);
        dfs(s + ')', numleft, numright + 1, n);
    }
};

