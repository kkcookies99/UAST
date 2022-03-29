 class Solution {
public:
    int XXX(string s) {
        int res = 0, sign = 1,i = 0, n = s.length();
        while(s[i++]==' ');i--;                 //跳过空格
        if(i<n && (s[i]=='+' || s[i]=='-')){    //判断符号
            sign = s[i]=='-'? -1: 1;   
            i++;
        }
        for(;i<n;++i){
            if(s[i]>='0' && s[i]<='9'){         //处理数字
                if(res>INT_MAX/10 || res==INT_MAX/10 && (s[i]-'0' > 7)){ //即将溢出
                    return (sign+1)? INT_MAX: INT_MIN;
                }
                res = res*10 + (s[i]-'0');
            }else{                              //其他符号
                break;
            }
        }
        return res * sign;
    }
};

