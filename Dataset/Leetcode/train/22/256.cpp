 class Solution {
public:
    vector<string> XXX(int n) {
        if (!n) {
            return {};
        }
        vector<string> ret;
        string ans;
        function<void(int, int)> dfs = 
        [&](int leftPar, int rightPar)->void {
            if (leftPar == n && rightPar == n) {
                ret.push_back(ans);
            }
            if (leftPar < n) {
                ans.push_back('(');
                dfs(leftPar + 1, rightPar);
                ans.pop_back();
            }
            if (rightPar < leftPar) {
                ans.push_back(')');
                dfs(leftPar, rightPar + 1);
                ans.pop_back();
            }
        };
        dfs(0, 0);
        return ret;
    }
};

