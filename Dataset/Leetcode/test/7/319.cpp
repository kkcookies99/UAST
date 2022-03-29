class Solution {
public:
    int XXX(int x) {
        int ret = 0;
        int falg = 1;
        if(x == INT_MIN)
            return 0;
        if(x < 0)
        {
            falg = -1;
            x = falg * x;
        }
        while(x)
        {
            if((INT_MAX - x % 10) /10  >= ret)
            {
                ret = ret * 10 + x % 10;
            }
                
            else
                return 0;
            x /= 10;
        }
        return ret * falg;
        
    }
};

