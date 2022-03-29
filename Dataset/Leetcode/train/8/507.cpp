 class Solution {
public:
    int XXX(string s) {
        int i = 0;
        long long res = 0;
        while(i < s.size() && s[i] == ' ') i++;
        if(i == s.size()) return 0;
        
        bool is_neg = false;
        if(s[i] == '-') {
            is_neg = true;
            i++;
        } else if(s[i] == '+') {
            i++;
        }

        for(; i < s.size(); i++) {
            if(s[i] > '9' || s[i] < '0') break;
            else {
                int val = s[i] - '0';
                if(is_neg) {
                    if(res >= 214748365 || res == 214748364 && val > 8) return INT_MIN;

                } else 
                    if(res >= 214748365 || res == 214748364 && val > 7) return INT_MAX;
                res = res * 10 + val;
            }
        }

        if(is_neg) return (int)(-res);
        return (int)res;
        // -2147483648 2147483647
        // cout << INT_MIN << " " << INT_MAX << endl;
        // return -0;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


