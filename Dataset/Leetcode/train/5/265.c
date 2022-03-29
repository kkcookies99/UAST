 char * XXX(char * s){
    int i=0,j,max_len=0,index[2]; 
    char out_str[1000],*p=out_str;
    int s_len=strlen(s);
    int judge(char *,int,int);
    for(;i<s_len;i++)
        for(j=i;j<s_len;j++)
            if(judge(s,i,j))
                if(j-i+1>max_len)
                {
                    max_len=j-i+1;
                    index[0]=i;
                    index[1]=j;
                }
    for(i=index[0];i<=index[1];i++,p++)
        *p=s[i];
    *p='\0';
    printf("%s",out_str);
    return out_str;
}

int judge(char *s,int i,int j)
{
    for(;i<=j;i++,j--)
        if(s[i]!=s[j])
            return 0;
    return 1;
}

