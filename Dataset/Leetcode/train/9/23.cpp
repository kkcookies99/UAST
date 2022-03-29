class Solution {
public:
    bool XXX(int x) {
        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }

        long result = 0;
        int copy = x;
        // reverse the number
        while(copy!=0){
            result *= 10;
            result += (copy%10);
            copy /= 10;
        }

        return (result == x);

    }
};

