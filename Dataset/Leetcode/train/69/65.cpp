class Solution {
public:
    int XXX(int x) {
        int t=1;
        while(x)
        {
            while(x/t>=t&&x/(t+1)<(t+1))
                return t;
            t++;
        }
        return 0;
    }
};

