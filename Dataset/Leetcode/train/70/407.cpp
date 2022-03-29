class Solution {
public:
    int XXX(int n) 
    {
        int f[2];
        if(n==1)
        {
            return 1;
        }

        f[0]=1;
        f[1]=2;
        int p=0;
        for(int i=3;i<n+1;i++)
        {
            if(p==0)
            {
            f[0]=f[0]+f[1];
            p=1;
            }
            else
            {
                f[1]=f[0]+f[1];
                p=0;
            }
        }
        return f[abs(p-1)];


    }
};

