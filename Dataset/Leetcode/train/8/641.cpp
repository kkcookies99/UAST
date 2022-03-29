 class Solution {
public:
    int XXX(string s) {
        int pos=0;
        while(s[pos] == ' '){
            pos++;
        }
        int sign=1;
        if(s[pos] == '+'){
            pos++; 
        }else if(s[pos] == '-'){
            sign = -1;
            pos++;
        }
        long long num=0;
        while(s[pos]=='0'){
            pos++;
        }
        while(s[pos]>='0' && s[pos]<='9'){
            num = num*10 + s[pos]-'0';
            if(num > INT_MAX){
                return sign==1?INT_MAX:INT_MIN;
            }
            if(num < INT_MIN){
                return sign==1?INT_MIN:INT_MAX;
            }
            pos++;
        }
        
        return num*sign;
    }
};
