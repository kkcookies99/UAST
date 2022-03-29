class Solution {
public:
    int XXX(int x) {
        int y = 0;
        while(x){
            if( y>0 && ((pow(2,31)-1) / y) < 10){
                return 0;
            }
            if( y<0 && (-pow(2,31) / y) < 10){
                return 0;
            }
            y = y*10 + x%10;
            x = x/10;
        }
        return y;
    }
};

