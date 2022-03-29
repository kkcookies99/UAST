class Solution {
public:
    int XXX(int x) {
        int y = 0;
        while(x!=0)
        {
            if(y>214748364 || y<-214748364)
                return 0;
            y = y*10 + x%10;
            x /= 10;
        }
        return y;
    }
};

