 class Solution {
public:
    int XXX(string s) {
        int i;
        double result=0;
        int temp;
        for(i=0;i<s.size();i++)
            if(s[i]==' ')
                continue;
            else
                break;
        s.erase(s.begin(),s.begin()+i);
        if(s[0]=='-'||s[0]=='+')//处理前面的零
        {
            for(i=1;i<s.size();i++)
                if(s[i]=='0') continue;
                else
                    break;
            if(i!=1)
            {
                s.erase(s.begin()+1,s.begin()+i);
                //0开头必须是正数
                if(s[1]-'0'>9||s[1]-'0'<0)
                    return 0;
            }      
        }
        else{
            for(i=0;i<s.size();i++)
                if(s[i]=='0') continue;
                else
                    break;
            if(i!=0)
            {
                s.erase(s.begin(),s.begin()+i);
                if(s[0]-'0'>9||s[0]-'0'<0)
                    return 0;
            }
                
        }
        //处理数字符号
        for(i=0;i<s.size();i++)
        {
            if((i==0&&s[i]=='-')||(i==0&&s[i]=='+'))
                continue;
            else if(s[i]-'0'>9||s[i]-'0'<0)
                break;
        }
        s.erase(s.begin()+i,s.end());

        if(s[0]=='-'){
            for(i=1;i<s.size();i++){
                temp=s[i]-'0';
                result=result*10+temp;
            }
            if(result>(double)INT_MAX+1)
                result=(double)INT_MAX+1;
            result=-result; 
        }
        else if(s[0]=='+'){
            for(i=1;i<s.size();i++){
                temp=s[i]-'0';
                result=result*10+temp;
            }
            if(result>INT_MAX)
                result=INT_MAX;
        }
        else{
            for(i=0;i<s.size();i++){
                temp=s[i]-'0';
                result=result*10+temp;
            }
            if(result>INT_MAX)
                result=INT_MAX;
        }
        return (int)result;
    }
};

