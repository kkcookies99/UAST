class Solution {
public:
    int XXX(int x) {
        int res=0;
        while(x){
            int tmp=x%10;
            if(res<INT_MIN/10 || res>INT_MAX/10) return 0;
            res=res*10+tmp;
            x/=10;
        }
        return res;
    }
};

