 class Solution {
public:
    int XXX(string s) {
        long res=0,index=0;
        bool isNegative =false;
        while(s[index]==' '){
            index++;
        }
        if(s[index]=='-' || s[index]=='+'){
            isNegative=s[index]=='-'?true:false;
            index++;
        }
        while(index<s.size()){
            if(!isdigit(s[index])){
                break;
            }
            res=res*10+s[index]-'0';
            if(isNegative && -res<=INT_MIN) return INT_MIN;
            if(!isNegative && res>=INT_MAX) return INT_MAX;
            ++index;
        }
        return isNegative?-res:res;
    }
};

