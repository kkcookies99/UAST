class Solution {
public:
    int XXX(int x) {
        int rpc = 0;
        while(x != 0){
            if(rpc > INT32_MAX/10 || (rpc == INT32_MAX/10 && x%10 > 7))
                return 0;
            if(rpc < INT32_MIN/10 || (rpc == INT32_MIN/10 && x%10 < -8))
                return 0;
            rpc = rpc*10 + x%10;
            x = x/10;
           
        }
       
        return rpc;
    }
};


