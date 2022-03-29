 int XXX(char * s){
    if(strlen(s)==0)
    {
        return 0;
    }
    int len=strlen(s);
    int res[len];
    for(int i=0;i<len;i++)
    {
        res[i]=findlength(s,i,len)-i;
    }
    return max(&res,len);
}
//寻找当前字符开头最长串，返回串尾
int findlength(char *s,int head,int tail)
{
    int ntail=tail;
    for(int i=head+1;i<tail;i++)
    {
        if(s[head]==s[i])
        {
            ntail=i;
            break;
        }
    }
    return ntail>head?findlength(s,++head,ntail):ntail;
}
//求数组最大值
int max(int res[],int len)
{
    int max;
    for(int i=0;i<len;i++)
    {
        max=max<res[i]?res[i]:max;
    }
    return max;
}

