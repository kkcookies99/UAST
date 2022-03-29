class Solution {
public:
    int XXX(int x) {
        double a=2,b;
        b = 0.5*(a+x/a);
        while(fabs(b-a)>0.1){
            a = b;
            b = 0.5*(a+x/a);
        }
        return (int)b;
    }
};

