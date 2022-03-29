class Solution {
public:
    string XXX(string a, string b) {
        reverse(a.begin(), a.end());
        reverse(b.begin(), b.end());
        string res;
        int c = 0;
        int i, j;
        for(i = 0, j = 0; i < a.size() && j < b.size(); i ++, j ++){
            int ia = a[i] - '0', ib = b[j] - '0';
            res += to_string((ia +ib + c) % 2);
            if(ia + ib + c > 1) c = 1;
            else c = 0;
        }
        if(i < a.size()){
            for(auto p = a.begin() + i; p != a.end(); p ++){
                int ia = *p - '0';
                res += to_string((ia + c) % 2);
                if(ia + c > 1) c = 1;
                else c = 0;
            }
        }
        if(j < b.size()){
            for(auto p = b.begin() + j; p != b.end(); p ++){
                int ib = *p - '0';
                res += to_string((ib + c) % 2);
                if(ib + c > 1) c = 1;
                else c = 0;
            }
        }  
        if(c) if(c) res += '1';
        reverse(res.begin(), res.end());
        return res;
    }
};

