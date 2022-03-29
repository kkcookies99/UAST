 class Solution {
public:
    void backtracking(int n, int left, int right) {
        if (right == n) {
            result.push_back(path);
            return;
        }
        if (left < n) {
            path.push_back('(');
            backtracking(n, left + 1, right);
            path.pop_back();
        }
        if (right < left) {
            path.push_back(')');
            backtracking(n, left, right + 1);
            path.pop_back();
        }
    }

    vector<string> XXX(int n) {
        backtracking(n, 0, 0);
        return result;
    }
    
private:
    string path;
    vector<string> result;
};

