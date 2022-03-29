class Solution {
public:
    int XXX(string str) {
        if(str.empty()) return 0;
        int i = 0;
        bool negative = false;
        long res = 0;
        while(str[i] == ' ') i++;
        if(str[i] == '-') {
            i++;
            negative = true;
        }
        else if(str[i] == '+') {
            i++;
        }
        for(; i<str.size(); i++) {
            if(str[i] >= '0' && str[i] <= '9') {
                res = res*10 + (str[i] - '0');
                if(res > INT_MAX && !negative)
                    return INT_MAX;
                else if(res > INT_MAX && negative)
                    return INT_MIN;
            }
            else // 遇到非法字符直接退出，停止解析
                break;
        }
        return negative ? -res : res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

