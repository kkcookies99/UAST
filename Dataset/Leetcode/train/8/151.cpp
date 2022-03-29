class Solution {
public:
    int XXX(string s) {
        char flag=1;
        auto iter=std::find_if(s.begin(), s.end(), [](char& c){
            return c!=' ';
            //return c=='-' || c=='+'|| ((c-'0')>=0 && (c-'0')<=9)        
        });
        if(iter == s.end())
        return 0;
        else
        {
            char c=*iter;
            if(c!='-' && c!='+' && ((c-'0')<0 || (c-'0')>9))
            return 0;
            else if(c=='-')
            {
                flag =-1;
                iter++;
            }
            else if(c=='+')
            {

            iter++;
            }
            long res=0;
            char c1=0;
            if(flag ==1)
            {
                
                for(;iter!=s.end();iter++)
                {
                    c1=(*iter-'0');
                    if(c1<0 || c1>9)
                    break;
                    res = res*10 + c1;
                    if(res>=INT_MAX)
                    return INT_MAX;
                }
                return res;
            }
            else
            {
                for(;iter!=s.end();iter++)
                {
                    c1=(*iter-'0');
                    if(c1<0 || c1>9)
                    break;
                    res = res*10 + c1;
                    if(res>INT_MAX)
                    return INT_MIN;
                }
                return -1*res;
            }
        }
        return 1; 
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

