 class Solution {
public:
    void dfs(vector<string> &result, string a, int left, int right)
    {
        if (right < left) {
            return;
        }
        if (left == 0 && right == 0) {
            result.push_back(a);
            return;
        }
        if (left != 0) {
            dfs(result, a + "(", left - 1, right);
        }
        if (right != 0) {
            dfs(result, a + ")", left, right - 1);
        }
    }
    vector<string> XXX(int n)
    {
        int left = n - 1;
        int right = n;
        string str = "(";
        vector<string> result;
        dfs(result, str, left, right);
        return result;
    }
};

