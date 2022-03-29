class Solution {
public:
    bool XXX(int x) {
        if(x < 0)
            return false;
        long temp = 0;
        int record = x;
        while(x != 0){
            temp = temp*10 + x%10;
            x/=10;
        }
        if(record == temp)
            return true;
        else
            return false;
    }
};

