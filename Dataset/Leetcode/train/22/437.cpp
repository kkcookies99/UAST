 class Solution {
public:
    vector<string> res;
    vector<string> XXX(int n) {
        dfs("", n, n);
        return res;
    }
    void dfs(string cur,int left_remain,int right_remain){
        if(left_remain<0 || right_remain<0  || left_remain > right_remain){
            return;
        }
        if(left_remain==0 && right_remain==0){
            res.push_back(cur);
        }
        dfs(cur+"(", left_remain - 1, right_remain);
        dfs(cur+")", left_remain, right_remain - 1);
    }
};

