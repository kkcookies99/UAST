class Solution {
public:
    int XXX(int n) {
        
        int *sum = new int [n + 1];
        sum[0] = 0;
        sum[1] = 1;
        sum[2] = 2;
        for(int i = 3; i <= n; i++)
            sum[i] = sum[i - 1] + sum[i - 2];
        return sum[n];
    }
};

