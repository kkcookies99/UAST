class Solution {
public:
    int XXX(string str) {
        int sign = 0; 
        int i = 0;
        for(; i < str.size(); ++i){
            if(str[i] == ' ' && sign == 0) continue;
            if(str[i] == '+' || (str[i] - '0' >= 0 && str[i] - '0' <= 9) && sign == 0) { 
                sign = 1; 
                if(str[i] == '+'){
                    i++;
                }
                break;
            }
            else if(str[i] == '-' && sign == 0) {sign = -1; ++i; break;}
            else break;
        }
        if(sign == 0) return 0;
        string tmp;
        while(i < str.size()){
            if(str[i] - '0' >= 0 && str[i] - '0' <= 9){
                tmp.push_back(str[i]);
                ++i;
            }
            else break;
        }
        if(tmp.size() == 0) return 0;
        if(tmp.size() > 10) {
            return sign > 0 ? INT_MAX: INT_MIN;
        }
        long res, beta = 1;
        for(int j = tmp.size() - 1; j >= 0; --j){
           res += (tmp[j] - '0') * beta;
           beta *= 10;
        }
        res *= sign;
        //cout << res << endl; /////////// 这行注释和不注释，执行代码结果不一样，并且和提交结果又不一样
        if(res > INT_MAX || res < INT_MIN) return res > INT_MAX ? INT_MAX: INT_MIN;
        return res;
    }
};```

