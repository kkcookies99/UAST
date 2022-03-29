 class Solution {
public:
    int XXX(string str) {
        if(str.size()==0)
            return 0;
        int i=0;
        while(str[i]==' ')
            i++;
        int flag=1;
        long long num=0;
        if(str[i]=='+'){
            i++;
            if(str[i]<'0'||str[i]>'9')
                return num;
        }
        if(str[i]=='-'){
            flag=-1;
            i++;
            if(str[i]<'0'||str[i]>'9')
                return num;
        }
        if(str[i]<'0'||str[i]>'9')
            return num;
        while(str[i]!='\0'&&str[i]>='0'&&str[i]<='9'){
            num=num*10+flag*(str[i]-'0');
            if (num > INT_MAX) 
                return INT_MAX;
            else if (num < INT_MIN)
                return INT_MIN;
            i++;
        }
        return num;
    }
};

