 class Solution {
public:
    int m, n, count;
    int XXX(int m, int n) {
        this->m = m;
        this->n = n;
        count = 0;
        dfs(1,1);
        return count;
    }
    void dfs(int i, int j){
        if(i == m && j == n){
            count++;
            return;
        }
        if(i > m || j > n) return;
        dfs(i, j + 1);
        dfs(i + 1, j);
    }
};

