 class Solution {
private:
    vector<string> res;
public:
    vector<string> XXX(int n) {
        dfs(n, 1, 0, "(");
        return res;
    }

    void dfs(int n, int lBracketNum, int rBracketNum, const string& path) {
        if (lBracketNum == n && rBracketNum == n) {
            res.push_back(path);
            return;
        }

        if (lBracketNum < n) { //选左括号
            dfs(n, lBracketNum + 1, rBracketNum, path + "(");
        }
        if (rBracketNum < n && lBracketNum > rBracketNum) {
            dfs(n, lBracketNum, rBracketNum + 1, path + ")");
        }
    }
};

