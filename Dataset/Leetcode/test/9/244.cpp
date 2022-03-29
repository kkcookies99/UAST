bool XXX(int x) {
    int a=1,i;
    int y=x;
    if (x<0)
        return false;
    else
    {
        while(x/10>=1)
        {
            x=x/10;
            a+=1;
        }
        int b[a];
        for(i=0;i<a;i++)
        {
            b[i]=y%10;
            y/=10;
        }
        for(i=0;i<a;i++)
        {
            if(b[i]!=b[a-i-1])
                return false;
        }
    }
    return true;
}

