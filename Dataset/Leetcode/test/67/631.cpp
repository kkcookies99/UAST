class Solution {
public:
    string XXX(string a, string b) {
        if (a.empty()) return b;
        if (b.empty()) return a;
        string res;
        int i = a.size()-1, j = b.size()-1, maxLen = i > j ? i+1 : j+1,tem,jinwei=0;
        char cha, chb;
        for (int k = 0; k < maxLen; k++)
        {
            cha = i >= 0 ? a[i] : '0';
            chb = j >= 0 ? b[j] : '0';
            tem = (cha - '0') + (chb - '0')+jinwei;
            jinwei = tem / 2;
            res = char(tem % 2 == 0 ? '0' : '1') + res;
            --i; --j;
        }
        if (jinwei == 1)
        {
            res = '1' + res;
        }
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


