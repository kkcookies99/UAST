 class Solution {
public:
    string XXX(string a, string b) {
        int lena=a.size();
        int lenb=b.size();
        if(lena>lenb)
        {
            while(lena>lenb)
            {
                b.insert(b.begin(),'0');
                lenb++;
            }
        }
        else
        {
            while(lenb>lena)
            {
                a.insert(a.begin(),'0');
                lena++;
            }
        }
        int len=lena;
        int temp=0;
        for(int i=lena-1;i>=0;i--)
        {
            if(a[i]==b[i])
            {
                if(temp)
                {
                    b[i]='1';
                }
                else
                {
                    b[i]='0';
                }
                temp=a[i]=='0'?0:1;
            }
             
            else
            {
                if(temp)
                {
                    b[i]='0';
                    temp=1;
                }
                else
                {
                    b[i]='1';
                    temp=0;
                }
            }
                
        }
        if(temp==1)
        {
            b.insert(b.begin(),'1');
        }
        return b;
    }
};

