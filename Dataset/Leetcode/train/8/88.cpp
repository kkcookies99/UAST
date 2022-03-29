class Solution {
public:
int XXX(string s) {
    int res = 0;
    int idx = 0;
    while (idx < s.size() && s[idx] == ' ') {
        idx++;
    }

    int tag = 0;
    if (idx < s.size() && s[idx] == '-') {
        tag = 1;
        idx++;
    }
    else if (idx < s.size() && s[idx] == '+') {
        idx++;
    }

    while (idx < s.size() && s[idx] == '0') {
        idx++;
    }

    int len = 0;
    while (idx < s.size() && s[idx] >= '0' && s[idx] <= '9') {
        if (len >= 10)return tag == 0 ? INT_MAX : INT_MIN;
        int num = s[idx] - '0';
        if (len == 9&&res==214748364) {
            if (tag == 0) {
                if(num>7)return tag == 0 ? INT_MAX : INT_MIN;
                res = 10 * res + num;
            }
            else if (tag == 1) {
                if(num>8)return tag == 0 ? INT_MAX : INT_MIN;
                res = 10 * (0-res) - num;
                tag=2;
            }
            idx++;
            len++;
            continue;
        }
        
        res = 10 * res + num;
        idx++;
        len++;
        if (len == 9 && res > 214748364 &&
         s[idx]>='0' && s[idx]<='9') {
            return tag == 0 ? INT_MAX : INT_MIN;
        }
    }

    if (tag == 2)return res;
    return tag==0?res:0-res;
}
};

