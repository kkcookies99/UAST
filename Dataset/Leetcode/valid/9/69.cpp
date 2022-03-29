class Solution {
public:
    bool XXX(int x) {
        if(x < 0)
            return false;
        
        long n = 0;
        int tempX = x;
        while(tempX){
            n = n * 10 + tempX % 10;
            tempX /= 10;
        }

        return n == x;
    }
};

