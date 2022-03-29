class Solution {
public:
    bool XXX(int x) {
        if(x<0) return false;
        int a=0,b=x;
        while(x&&a<INT_MAX/10){
            a=a*10+x%10;
            x/=10;
        }
        return a==b;
    }
};

