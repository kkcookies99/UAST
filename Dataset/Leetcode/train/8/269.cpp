class Solution {
public:
    int XXX(string str) {
        if(str.size()==0)
            return 0;
        int i=0;
        bool minus=false;
        long long num=0;
        
        while(str[i]==' ')
            i++;
        
        if ((str[i]!='-'&&str[i]!='+') && (str[i]<'0'||str[i]>'9')){
            return 0;
        }
        
        
        if(str[i]=='-')
        {
            minus=true;
            i++;
        }else if(str[i]=='+')
        {
            i++;
        }
        
 
        if(str[i]<'0'||str[i]>'9')
            return num;
        
        while(str[i]!='\0'&&(str[i]>='0'&&str[i]<='9'))
        {
            if (minus) {
                if(num>INT_MAX/10||(num==INT_MAX/10&&(str[i]-'0')>8)){
                    return INT_MIN;
                }
            }else{
                if(num>INT_MAX/10||(num==INT_MAX/10)&&(str[i]-'0')>7){
                    return INT_MAX;
                }
            }
            num=num*10+(str[i]-'0');
            i++;
        }
        
        return minus == true ? num * -1 : num;
    }
};
