 class Solution {
public:
    int XXX(string s) {
        int len=s.size();
        int a[15],sum=0;
        for(int i=0;i<=len-1;i++)
        {
            if(s[i]=='I')
                a[i]=1;
            if(s[i]=='V')
                a[i]=5;
            if(s[i]=='X')
                a[i]=10;
            if(s[i]=='L')
                a[i]=50;
            if(s[i]=='C')
                a[i]=100;
            if(s[i]=='D')
                a[i]=500;
            if(s[i]=='M')
                a[i]=1000;
            sum+=a[i];
        }
        for(int i=0;i<=len-2;i++)
            if(a[i]<a[i+1])
                sum-=2*a[i];
                
        return sum;
    }
};

