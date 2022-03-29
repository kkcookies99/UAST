class Solution {
public:
    string XXX(string a, string b) {
        string ans = "";
        int len_a = a.length();
        int len_b = b.length();
        char co = '0';
        int i, j;
        for (i = len_a - 1, j = len_b - 1; i >= 0 || j >= 0; i--, j--) {
            char sum = '0';
            char numa = '0';
            char numb = '0';
            if (i >= 0 ) {
                numa = a[i];
            }
            if (j >= 0) {
                numb = b[j];
            }
            sum = fulladder(numa, numb, &co);
            ans.insert(0, string(1, sum));
        }
        if (co == '1') {
            ans.insert(0, string(1, co));
        }
        return ans;
    }
    void halfadder(char a, char b, char* out, char* co) {
        if (a == '1' && b == '1') {
            *co = '1';
            *out = '0';
        } else {
            *co = '0';
            *out = max(a, b);
        }
    }

    char fulladder(char a, char b, char* co) {
        char hout = '0';
        char hco1 = '0';
        char hco2 = '0';
        halfadder(a, b, &hout, &hco1);
        halfadder(hout, *co, &hout, &hco2);
        if (hco1 == '1' || hco2 == '1') {
            *co = '1';
        } else {
            *co = '0';
        }
        return hout;
    }
};


