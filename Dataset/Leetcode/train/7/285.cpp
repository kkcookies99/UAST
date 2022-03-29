class Solution {
public:
    int XXX(int x) {
        long y=0;
        for(;x!=0;x=x/10)
        {
            y*=10;
            y+=(x%10);
        }
        if(y>2147483647||y<-2147483648)
        {
            return 0;
        }
        int z = (int)y;
        return z;
    }
};