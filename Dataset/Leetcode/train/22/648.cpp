 class Solution {
public:
    vector<string> ans;
    string path;
    int n;

    void dfs(int x, int y)
    {
        if(x > n) return;
        if(x==n && y==n) {
            ans.push_back(path);
            return;
        }

        path += '(';
        dfs(x+1, y);
        path.pop_back();

        if(x > y) {
            path += ')';
            dfs(x, y+1);
            path.pop_back();
        }
    }

    vector<string> XXX(int n) {
        this->n = n;
        dfs(0, 0);
        return ans;
    }
};

