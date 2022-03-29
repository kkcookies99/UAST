 class Solution {
public:
    void generateLeft(vector<string> &result, string& cur, int open, int close, int n) {
        cur.push_back('(');
        open ++;
        if (open == n) {
            cur.append(n - close, ')');
            result.push_back(cur);
            return;
        }

        for (int i = 0; i <= open - close; i++) {
            string next = cur;
            next.append(i, ')');
            generateLeft(result, next, open, close + i, n);
        }
        return;
    }
    vector<string> XXX(int n) {
        vector<string> result;
        string cur;
        generateLeft(result, cur, 0, 0, n);
        return result;
    }
};

