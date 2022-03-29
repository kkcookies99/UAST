class Solution {
public:
    int XXX(int n) {
        if(n<2) return 1;
        int p1=1, p2=1;
        for(int i=2; i<=n; i++){
            p2 = p1 + p2;
            p1 = p2 - p1;
        }
        return p2;
    }
};

