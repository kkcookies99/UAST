 class Solution {
public:
    string XXX(string a, string b) {
        string str(1 + a.length() + b.length(), '0');
        int len1 = a.length();
        int len2 = b.length();
        int len3 = str.length();
        char carray = 0;
        while (len1 || len2) {
            int num1 = len1 ? a[len1 - 1] - '0' : 0;
            int num2 = len2 ? b[len2 - 1] - '0' : 0;
            int sum = num1 + num2 + carray;
            carray = sum / 2;
            str[len3 - 1] = sum % 2 + '0';
            if (len1) {
                len1--;
            }
            if (len2) {
                len2--;
            }
            len3--;
        }
        
        if (carray) {
            str[len3 - 1] = '1';
            len3--;
        }

        int i = 0;
        while (i < str.length() && '0' == str[i]) {
            i++;
        }
        str = str.substr(i, str.length() - i);
        return str.empty() ? "0" : str;
    }
};

