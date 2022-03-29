 class Solution {
public:
    int XXX(string s) {
        int judge=0;
        long res=0;
        int i,j;
        for(i=0;i<s.size();i++)
        {
            if(s[i]!=' ')
            {
                j=i;
                break;
            }    
        }
        if(s[j]=='-')
        {
            judge=1;
            i+=1;   
        }
        else if(s[j]=='+')
            i+=1;
            
        for(i=i;i<s.size();i++)
        {
            if(s[i]>='0'&&s[i]<='9')
            {
                res=res*10+s[i]-'0';
                if(res>INT_MAX&&judge==0)
                    return INT_MAX;
                else if(-res<INT_MIN&&judge==1)
                    return INT_MIN;
            }
            else
                break;
        }
        if(judge==1)
            return -res;
        return res;
    }
};```

