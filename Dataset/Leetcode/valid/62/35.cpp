 class Solution {
public:
    int XXX(int m, int n) {
        backtrace(1,1,m,n);
        return ans;
    }
    int ans = 0;
    void backtrace(int i, int j, int m, int n){
        if(i == m && j == n)//到终点了，更新ans
            ans++;
        if(i + 1 <= m)//如果能往下走，就向下移动
            backtrace(i + 1, j, m, n);
        if(j + 1 <= n)//如果能往右走，就向右移动
            backtrace(i, j + 1, m, n);
    }
};

