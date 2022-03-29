class Solution {
public:
    int DP[100];
    int XXX(int m, int n) {
        for(int i=0;i<n;i++)DP[i]=1;
        for(int i=1;i<m;i++)
            for(int j=1;j<n;j++)
                DP[j]+=DP[j-1];
        return DP[n-1];
    }
};

