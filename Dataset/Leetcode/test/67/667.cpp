class Solution {
public:
    string XXX(string a, string b) {
        int lena = a.length(), lenb = b.length();
        int len = min(lena, lenb);
        int isamin =  lena < lenb;
        int plus = 0;
        string ans = "";
        for (int i = 1; i <= len; i++) {
            int ai = a[lena - i] - '0';
            int bi = b[lenb - i] - '0';
            int s = ai + bi + plus;
            ans = char(s%2 + '0') + ans;
            plus = s/2;
        }
        if (isamin) {
            for (int i = len + 1; i <= lenb; i++) {
                int bi = b[lenb - i] - '0';
                int s = bi + plus;
                ans = char(s%2 + '0') + ans;
                plus = s/2;
            }
        } else {
            for (int i = len + 1; i <= lena; i++) {
                int ai = a[lena - i] - '0';
                int s = ai + plus;
                ans = char(s%2 + '0') + ans;
                plus = s/2;
            }
        }
        if (plus > 0) ans = char(plus + '0') + ans;
        return ans;
    }
};

