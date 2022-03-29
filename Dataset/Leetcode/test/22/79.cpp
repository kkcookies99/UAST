 class Solution {
public:
    // 用于存储当前字符串
    string cur = "";
    vector<string> res;
    vector<string> XXX(int n) {
        dfs(n, n);
        return this->res;
    }
    void dfs(int n, int k) {
        // n为剩余左括号数，k为剩余右括号数
        if (n == 0 && k == 0) {
            res.push_back(cur);
            return;
        }
        // n不为0时，添加左括号
        if (n != 0) {
            this->cur += "(";
            dfs(n-1, k);
            this->cur.pop_back();
        }
        // k比n大时，添加右括号
        if (k > n) {
            this->cur += ")";
            dfs(n, k-1);
            this->cur.pop_back();
        }
    }
};

