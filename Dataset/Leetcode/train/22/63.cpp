 class Solution {
public:
    vector<string> res;
    string path;
    vector<string> XXX(int n) {
        dfs(0, 0, n);
        return res;
    }

    void dfs(int l_cnt, int r_cnt, int n) {
        if(path.size() == n * 2 && l_cnt == r_cnt) {
            res.push_back(path);
            return ;
        }
        
        if(l_cnt < r_cnt || l_cnt > n || r_cnt > n) return ;

        path.push_back('('), ++l_cnt;
        dfs(l_cnt, r_cnt, n);
        path.pop_back(), --l_cnt;

        path.push_back(')'), ++r_cnt;
        dfs(l_cnt, r_cnt, n);
        path.pop_back(), --r_cnt;
    }
};

