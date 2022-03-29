class Solution {
public:
    int XXX(string s) {
        if(s.empty())
            return 0;
        int ans = 0,i = 0,t;
        while(s[i]==' '&&i<s.size())
            ++i;
        
        if(i>=s.size() || ((s[i]!='+')&&(s[i]!='-')&&((s[i]<'0') || (s[i]>'9'))))
            return 0;
        //cout<<s[i];
        if(s[i]!='+'&& s[i]!='-'){
           if(s[i]=='0'&& i+1<s.size()&&(s[i+1]>='0')&& (s[i+1]<='9')){ //当前数字后还有数字
                while(i+1<s.size()&& s[i+1]=='0')  
                    ++i;
                if(i==s.size() || s[i+1]<'0' || s[i+1]>'9' )
                     return 0; 
                 t =s[++i]-'0';
           }
           else
                t =s[i]-'0';  //只有一个数字
        }
        else if(s[i]=='-'){
            if(i+1<s.size()&&(s[i+1]>='0')&& (s[i+1]<='9')){ //负号后是数字
                while(i+1<s.size() && s[i+1]=='0')  //找第一个非0数
                    ++i;
                if(i==s.size() || s[i+1]<'0' || s[i+1]>'9' ) 
                    return 0; //负号后全是0,或0后没有效数字
                //cout<<i<<" "<<s[i];
                t =-(s[++i]-'0');
                
            }
            else
                return 0;
        }
        else{
            if(i+1<s.size()&&(s[i+1]>='0')&& (s[i+1]<='9')){ //正号后是数字
                while(i+1<s.size()&& s[i+1]=='0')  
                    ++i;
                if(i==s.size() || s[i+1]<'0' || s[i+1]>'9' )
                     return 0; 
                 t =s[++i]-'0';
             } 
            else
                return 0;
        }
        //cout<<t;
        while(i+1<s.size()&&(s[i+1]>='0')&& (s[i+1]<='9')){
            int nextnum =s[i+1]-'0';
            if(t>0&&t<=(2147483647-nextnum)/10)
                t = t*10+nextnum;
            else if(t<0&&t>=(-2147483648+nextnum)/10)
                t = t*10-nextnum;
            else if(t>0)
                return 2147483647;
            else
                return -2147483648;
            ++i;
        }
        
        return t;  
    }
};

