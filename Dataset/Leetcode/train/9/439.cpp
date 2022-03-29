 class Solution {
public:
    bool XXX(int x) {

        int y=0;
        int temp = x;

        if(x<0)
            return false;
        else{
            while(x){
                if((pow(2,31)-1) / y < 10)
                    return false;
                y = y*10+x%10;
                x = x/10;
            }
            if(y == temp)
                return true;
            else
                return false;
        }
    }
};

