 class Solution {
public:
    vector<string> res;
    string s;
    
    void backTrack(int n, int left, int right) {
        if (n == 0) {
            res.push_back(s);
            return;
        }

        if (left - right < n) { 
            s.push_back('(');
            backTrack(n - 1, left + 1, right);
            s.pop_back();
        }

        if (left > right) {
            s.push_back(')');
            backTrack(n - 1, left, right + 1);
            s.pop_back();
        }
    }

    vector<string> XXX(int n) {
        res.clear();
        s = "";
        backTrack(n * 2, 0, 0);
        return res;
    }
};

