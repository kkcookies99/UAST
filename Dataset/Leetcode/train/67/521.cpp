class Solution {
public:
    //其实就是大数加法
    string XXX(string a, string b) {
        int na = a.size(), nb = b.size();
        if(na < nb) {
            swap(a, b);
            na = na ^ nb;
            nb = na ^ nb;  // nb = na ^ nb ^ nb = na ^ 0 = na
            na = na ^ nb;  // na = na ^ nb ^ na = nb
        }
        int jw = 0;
        int i, j;
        string res("");
        for(i = na - 1, j = nb - 1; j >= 0; i--, j--) {
            int cur = (a[i] - '0' + b[j] - '0' + jw) % 2;
            jw = (a[i] - '0' + b[j] - '0' + jw) / 2;
            a[i] = cur + '0';
        }
        while(i >= 0) {
            int cur = (a[i] - '0' + jw) % 2;
            jw = (a[i] -'0' + jw) / 2;
            a[i] = cur + '0';
            i--;
        }
        res = a;
        if(jw) {
            res = "1" + a;
        }
        
        return res;
    }

    
};

