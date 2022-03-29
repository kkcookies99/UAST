 class Solution {
public:
    bool XXX(int x) {
        if(x<0)return false;
        long long y=0,z=x;
        while(x){
            y*=10;
            y+=x%10;
            x/=10;
        }
        if(z==y)return true;
        return false;
    }
};

