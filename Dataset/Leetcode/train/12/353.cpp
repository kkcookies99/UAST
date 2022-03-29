 class Solution {
public:
    string XXX(int num) {
        string ret;
        if (num >= 1000) {
            int bit = num / 1000;
            num %= 1000;
            while (bit-- > 0) {
                ret.push_back('M');
            }
        } 
        
        if (num >= 100) {
            int bit = num / 100;
            num %= 100;

            app(bit, 'C', 'D', 'M', ret);
        } 
        
        if (num >= 10) {
            int bit = num / 10;
            num %= 10;

            app(bit, 'X', 'L', 'C', ret);
        }
        app(num, 'I', 'V', 'X', ret);

        return ret;
    }

    inline void app(int num, char s, char m, char b, string& str) {
        if (num < 4) {
            while (num-- > 0) {
                str.push_back(s);
            }
        } else if (num == 4) {
            str.push_back(s);
            str.push_back(m);
        } else if (num < 9) {
            str.push_back(m);
            num -= 5;
            while (num-- > 0) {
                str.push_back(s);
            }
        } else {
            str.push_back(s);
            str.push_back(b);
        }
    }
};

