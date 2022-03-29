 class Solution {
public:

    //字符转小写
    char lower(char c) {
        if (c >= 'a' && c <= 'z') return c;
        return c - 'A' + 'a';
    }

    //字符是否有效
    bool validChar(const char c) {
        return  (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    bool XXX(string s) {
        if (s.empty() || s.length() == 1) return true;

        int leftIndex = 0;
        int rightIndex = (int)s.length()-1;
        
        while (leftIndex < rightIndex) {
            
            while (!validChar(s[leftIndex]) && leftIndex < rightIndex) { ///可能有多个字符要过滤 如",,,ab"
                ++leftIndex;
            }

            while (!validChar(s[rightIndex]) && leftIndex < rightIndex) {///可能有多个字符要过滤 如"ab,,,"
                --rightIndex;
            }

            if (s[leftIndex] != s[rightIndex] && lower(s[leftIndex]) != lower(s[rightIndex]))  { //全部转成小写判断 注意: "0P" "1Q"，禁止错误的用R-L==32判断
                return false;
            }
            
            ++leftIndex;
            --rightIndex;
        }

        return true;
    }
};

