class Solution {
public:
    int XXX(int x) {
        if(x == 0) return 0;
        int nbits = 0;
        int tmp = x;
        while(tmp>0){
            tmp>>=1;
            nbits++;
        }
        int low = 1<<((nbits-1)>>1);
        int up = low<<1;
        int ret;
        while(1){
            ret = (up+low)>>1;
            if(ret == low) return low;
            tmp = x/ret;
            if(ret > tmp) {
                up=ret;
            }
            else if(ret==tmp) break;
            else
                low=ret;
        }
        return ret;
    }
};

