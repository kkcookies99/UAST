 class Solution {
public:
    int XXX(int x) {
        char srcStr[32] = {0};
        char dstStr[32] = {0};

        if(x < INT_MIN || x> INT_MAX)
            return 0;

        int srcLen = sprintf(srcStr, "%d", x);
        srcStr[srcLen] = '\0';

        int i = 0;
        while (srcLen > 0)
            dstStr[i++] = srcStr[srcLen-- - 1];

        int dst;
        try{
            dst = stoi(dstStr);
        }catch(...)
        {
            return 0;
        }
            
        if(x < 0)
            dst = ~dst + 1;

        return dst;
    }
};

