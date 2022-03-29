 class Solution {
public:
    int XXX(string s) {
        long long res=0,i=0;
        bool flag=false;
        while(s[i]==' ') i++; //跳过前导空格
        if(s[i]=='-'){ //如果有负号
            flag=true;
            i++;
        }else if(s[i]=='+') i++;//如果有正号
        for(;i<s.size();i++){
            if(s[i]>='0'&&s[i]<='9'){
                res=res*10+(s[i]-'0');
                if(res>INT_MAX) break;
            }else break;
        }
        if(flag) res=-res;
        if(res>INT_MAX) return INT_MAX;
        else if(res<INT_MIN) return INT_MIN;
        return res;
    }
};

