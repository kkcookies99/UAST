 class Solution {
public:
    void backtrack(vector<string>& res, int i, int j, string& cur, int n) {
        if(cur.size() == n * 2) {
            res.push_back(cur);
            return;
        }
        if(i<n) {
            cur.push_back('(');
            backtrack(res, i + 1, j, cur, n);
            cur.pop_back();
        }
        if(i>j) {
            cur.push_back(')');
            backtrack(res, i, j + 1, cur, n);
            cur.pop_back();
        }
    }
    vector<string> XXX(int n) {
        vector<string> res;
        string cur;
        backtrack(res, 0, 0, cur, n);
        return res;
    }
};

