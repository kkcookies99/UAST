class Solution {

    void backtracking(int path, int n,int& ans) {
        if (path > n) return;
        if (path == n) {
            ans++;
            return;
        }
        for (int i = 1; i < 3; i++) {
            backtracking(path + i, n,ans);
        }
    }

public:
    int XXX(int n) {
        int ans = 0;
        backtracking(0, n,ans);
        return ans;
    }
};
