 int XXX(char * s){
    int slen=sizeof(s)/sizeof(char);
    int i,j,x,c,ans,maxans;
    if(slen==0) return 0;
    else
    {
        maxans=1;
    for(i=0;i<slen-1;++i)
    {
        ans=1;
        for(j=i+1;j<slen;++j)
        {
            c=0;
            for(x=i;x<j;++x)
            {
                if(s[x]==s[j])
                {
                    c=1;
                    break;
                }
            }
            if(c==0) ans=ans+1;
            else break;
        }
        if(maxans<ans) maxans=ans;
    }
    return maxans;
    }
}

