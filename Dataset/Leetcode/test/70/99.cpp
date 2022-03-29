class Solution {
public:
    int XXX(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        int f_n_1 = 1;
        int f_n_2 = 2;
        int f_n;
        for(int i=3;i<=n;i++){
            f_n = f_n_1+f_n_2;
            f_n_1 = f_n_2;
            f_n_2 = f_n;
        }
        return f_n;
    }   
};

