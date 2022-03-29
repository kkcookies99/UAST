class Solution {
public:
    int XXX(int n) {
        if(n==1)return 1;
        int f1=1;
        int f2=2;
        for(int i=2;i<n;i++){
            int t=f1+f2;
            f1=f2;
            f2=t;
        }
        return f2;
    }
};

