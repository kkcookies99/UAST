 char * XXX(int n){
    if(n==1)
        return "1";
    char *s=XXX(n-1);
    char *ans=(char*)malloc(5000);
    int count=0,j=0;
    for(int i=0;i<strlen(s);i++)
    {
        count++;
        if(s[i]!=s[i+1])
        {
            ans[j++]=count+'0';
            ans[j++]=s[i];
            count=0;
        }
    }
    ans[j]='\0';
    return ans;
}

