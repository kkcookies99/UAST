class Solution {
public:
    int XXX(int x) {
       double a = 0;
        for (double  i = 0; i>= 0; i++)
        {
            if ( x == i*i || (i*i < x && (i+1)*(i+1) > x))
            {
                a = i;
                break;
            }            
        }
        return a;
    }
};

