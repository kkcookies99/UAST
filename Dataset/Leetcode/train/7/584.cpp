 class Solution {
public:
    int XXX(int x) {
        int temp = x % 10;
        while(x /= 10){
            if(temp > 214748364 || temp < -214748364)
                return 0;
            temp = 10 * temp + x % 10;
        }
        return temp;
    }
};

