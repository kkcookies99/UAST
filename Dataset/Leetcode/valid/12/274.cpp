 class Solution {
public:
    std::string XXX(int num) {
        std::string out;
        XXXInternal(out, num/1000, "M", "", "");
        num%=1000;
        XXXInternal(out, num/100, "C", "D", "M");
        num%=100;
        XXXInternal(out, num/10, "X", "L", "C");
        num%=10;
        XXXInternal(out, num, "I", "V", "X");

        return out;
    }

private:
    inline void XXXInternal(std::string& out, int num, const char* one , const char* five, const char* ten) {
        if(0 == num) {
            return ;
        }
        
        if(num < 4) {
            while(num--) {
                out += one;
            }
        } else if(4 == num) {
            out = out + one + five;
        } else if (num > 4 && num < 9) {
            out += five;
            while(num-- > 5) {
                out += one;
            }
        } else if (9 == num) {
            out = out + one + ten;
        }
    }
};

