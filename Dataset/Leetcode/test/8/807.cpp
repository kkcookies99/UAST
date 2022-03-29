 class Solution {
public:
    int XXX(string str) {
        if (str.empty()) return 0;

        char sign_symbol = 1;    // 正负符号，1：正，-1：负
        long long result = 0;

        auto ch = str.cbegin();

        // 跳过所有开头的空格
        while (ch < str.cend() && *ch == ' ')
            ch++;

        // 判断第一个不为空格的字符
        if (*ch == '-')
            sign_symbol = -1;
        else if (*ch == '+')
            sign_symbol = 1;
        else if (isdigit(*ch))
            result = *ch - '0';
        else
            return 0;
        
        ch++;

        while (ch < str.cend() && isdigit(*ch)) {
            result = 10 * result + (*ch - '0');

            if (sign_symbol * result > 2147483647)
                return 2147483647;
            else if (sign_symbol * result < -2147483648)
                return -2147483648;
            else
                ch++;
        }

        return sign_symbol * result;
    }
};

