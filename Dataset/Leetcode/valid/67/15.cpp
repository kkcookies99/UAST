 class Solution {
public:
    string XXX(string a, string b) {
        string res;
        int flag = 0;
        int al = a.size()-1, bl = b.size()-1;
        while (al > -1 || bl > -1) {
            if (al > -1 && bl > -1) {
                int tmp = a[al] + b[bl];
                if (flag == 0) {
                    if (tmp == '1' + '1') {
                        res += '0';
                        flag = 1;
                        al--;
                        bl--;
                    }
                    else {
                        res += tmp-'0';
                        al--, bl--;
                        flag = 0;
                    }
                }
                else {
                    if (tmp == '0'+'0') {
                        res += '1';
                        al--;
                        bl--;
                        flag = 0;
                    }
                    else if(tmp=='1'+'0'){
                        res += '0';
                        flag = 1;
                        al--;
                        bl--;
                    }
                    else if(tmp=='1'+'1') {
                        res += '1';
                        flag = 1;
                        al--;
                        bl--;
                    }
                }
            }
            else if (al > -1) {
                if (flag == 0) {
                    res += a[al]; al--;
                }
                else {
                    if (a[al] =='1') {
                        res += '0';
                        flag = 1;
                        al--;
                    }
                    else {
                        res += '1';
                        flag = 0;
                        al--;
                    }
                }
            }
            else if (bl > -1) {
                if (flag == 0) {
                    res += b[bl];
                    bl--;
                }
                else {
                    if (b[bl] =='1') {
                        res += '0';
                        flag = 1;
                        bl--;
                    }
                    else {
                        res += '1';
                        flag = 0;
                        bl--;
                    }
                }
            }

        }
       if (flag == 1) res+='1';
        reverse(res.begin(), res.end());
        return res;
    }
};

