 class Solution {
public:
    void backTrack(int n, int depth, int l, int r, string str, vector<string>& res) {
        if (l < r || l > n) {
            return;
        }
        if (depth == n * 2) {
            res.push_back(str);
            return;
        }
        str += '(';
        backTrack(n, depth + 1, l + 1, r, str, res);
        str.erase(str.size() - 1);
        str += ')';
        backTrack(n, depth + 1, l, r + 1, str, res);
        str.erase(str.size() - 1);
    }
    vector<string> XXX(int n) {
        if (n == 0) {
            return {};
        }
        vector<string> res;
        string str;
        backTrack(n, 0, 0, 0, str, res);
        return res;
    }
};

