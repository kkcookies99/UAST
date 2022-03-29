class Solution {
public:
    int XXX(string s) {       
        int len=s.size();
        int last,first;
        int flag=0;
        for(int i=len-1;i>=0;--i)
        {
            if(!isspace(s[i]) && flag==0)
            {
                last=i;
                flag=1;               
            }
            if(flag==1 && isspace(s[i]))
            {
                first=i+1;
                return last-first+1;
            }
        }
        return last+1;       
    }
};

