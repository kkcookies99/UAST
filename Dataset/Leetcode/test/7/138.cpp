class Solution {
public:
    int XXX(int x) {
       int a = 0;
        long ret = 0;
        while(x != 0)
        {
            a = x % 10;
            x = x / 10;
            ret = ret * 10 + a;
            
            if(ret < INT_MIN || ret > INT_MAX)
                return 0;
        }
        
        return (int)ret;   
    }
};

