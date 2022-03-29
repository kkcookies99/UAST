 class Solution {
public:

    // 左括号始终要小于等于右括号数量，深度优先搜索即可
    void dfs(vector<string> &ans, int left, int right, string s){
        if(right==0){
            ans.push_back(s);
        }else{
            if(left==right){
                dfs(ans, left-1,right, s+'(');
            }else{
                if(left>0)
                    dfs(ans, left-1,right, s+'(');
                dfs(ans, left,right-1, s+')');
            }
        }
    }

    vector<string> XXX(int n) {
        vector<string> ans;
        string s = "";
        dfs(ans, n, n, s);
        return ans;
    }
};

