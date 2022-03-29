class Solution {
public:
    int XXX(int x) {
        if(x==0) return 0;
        unsigned int a=x;
        do a=0.5*(a+x/a);
        while(x/a<a);
        return a;
    }
};

