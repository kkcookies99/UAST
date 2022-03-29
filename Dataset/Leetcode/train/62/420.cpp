class Solution {
public:

    int dfs(int m, int n)
    {
        if(m == 1)
            return 1;
        if(n == 1)
            return 1;
        
        return dfs(m - 1, n) + dfs(m, n - 1);
    } //不行啊 超时啊 吐了啊

    int XXX(int m, int n) {
        // return dfs(m, n);
        int N = n + m - 2;
        double res = 1;
        for (int i = 1; i < m; i++)
            res = res * (N - (m - 1) + i) / i;
        return (int) res;
    }

};

