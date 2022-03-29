 class Solution {
public:
    int XXX(int m, int n) {
        if(m<=0||n<=0)return 0;
        if(m==1||n==1)return 1;
        long double count = 1;
        if(n<m){
            int temp = n;
            n = m;
            m = temp;
        }
        for(int i=n;i<=m+n-2;i++){
            count *= i;
            count /= (i-n+1);
            }
        return int(count);
    }
};

