 class Solution {
public:
    string XXX(string a, string b) {
        if(a.length()<b.length())
        {
            int length=b.length()-a.length();
            for(int i=0;i<length;i++)
                a="0"+a;
        }
        else
        {
             int length=-(b.length()-a.length());
            for(int i=0;i<length;i++)
                b="0"+b;
        }
        int ptra=a.length()-1,ptrb=b.length()-1;
        int cf=0;
        string ans;
        while(ptra>=0&&ptrb>=0)
        { 
            if(a[ptra]=='0'&&b[ptrb]=='0'&&cf==0)
            {
                cf=0;
                ans="0"+ans;
            }
            else if(a[ptra]=='0'&&b[ptrb]=='0'&&cf==1)
            {
                cf=0;
                ans="1"+ans;
            }
            else if(a[ptra]=='0'&&b[ptrb]=='1'&&cf==0)
            {
                cf=0;
               ans="1"+ans;
            }
            else if(a[ptra]=='0'&&b[ptrb]=='1'&&cf==1)
            {
                cf=1;
                ans="0"+ans;
            }
            else if(a[ptra]=='1'&&b[ptrb]=='0'&&cf==0)
            {
                cf=0;
              ans="1"+ans;
            }
            else if(a[ptra]=='1'&&b[ptrb]=='0'&&cf==1)
            {
                cf=1;
                 ans="0"+ans;
            }
            else if(a[ptra]=='1'&&b[ptrb]=='1'&&cf==0)
            {  
                cf=1;
                ans="0"+ans;
            }
             else if(a[ptra]=='1'&&b[ptrb]=='1'&&cf==1)
            {
                cf=1;
                ans="1"+ans;
            }
            ptra--;
            ptrb--;
        }
        
        if(cf==1)
        ans="1"+ans;
    
        return ans;
    }
};

