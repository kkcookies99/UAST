class Solution {
public:
    int XXX(int n) {
        int a=1;
        long b=1;
        for(int i=1;i<=n;i++){
            long c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
};

