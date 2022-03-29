class Solution {
public:
    int XXX(int n) {
        int count=0;
        int a;
        int b;
        double C=1;
        if(n == 1){return 1;}
        for(int i=n/2;i>=0;i--)
        {
            for(int j=0;j<=n-i;j++)
            {
                if((i*2+j*1==n))
                {
                    a=(i>j?j:i);
                    b=i+j;
                    for(int k=0;k<a;k++)
                    {
                        C*=(b-k);
                    }
                    for(int k=0;k<a;k++)
                    {
                        C/=(k+1);
                    }
                    count+=C;
                }
                C=1;
            }
        }
        return count;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


