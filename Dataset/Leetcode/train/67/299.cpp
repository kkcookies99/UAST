 class Solution {
public:
    string XXX(string a, string b) {
        while(a.length()<b.length())a='0'+a;
        while(b.length()<a.length())b='0'+b;
        int count=0;
        for(int i=a.length()-1;i>=0;i--)
        {
            a[i]=a[i]+b[i]-'0'+count;
            if(a[i]>='2')
            {
                a[i]-=2;
                count=1;
            }
            else count=0;
        }
        if(count==1)a='1'+a;
        return a;
    }
    
};

