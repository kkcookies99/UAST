 class Solution {
public:
    int XXX(string s) {
        while(s.size() && s[0] == ' ') s.erase(0,1); //去前导空格
        if(s == "") return 0;
        if((s[0] == '-' && s[1] =='+')||(s[0]=='+' && s[0] == '-')) return 0; //两种符号直接特判
        bool is_neg = false;
        if(s[0] == '-') is_neg = true,s.erase(0,1);
        if(s[0] == '+')  s.erase(0,1);
        int res = 0;
        for(int i = 0; i < s.size(); i++){
            if( !isdigit(s[i])) break;
            int num = s[i] - '0';
            if(res > (INT_MAX- num) / 10){
                if(is_neg) return INT_MIN;
                return INT_MAX;
            }
            res = res * 10 + num;
        }
        return is_neg?-res:res;
    }
};

