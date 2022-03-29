class Solution {
public:
    int XXX(int x) {
        long result = 0;

        // XXX the number
        while(x!=0){
            result *= 10;
            result += (x%10);
            x /= 10;
        }

        // check the result
        // for valid negative number, after shifting right 31 bits, its value must be -1
        // for valid positive number, after shifting right 31 bits, its value must be 0
        if((result >> 31) == 0 || (result >> 31) == -1){
            return result;
        }

        return 0;
    }
};

