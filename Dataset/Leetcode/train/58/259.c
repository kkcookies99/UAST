 int XXX(char * s){
    int length=strlen(s);
    int res=0,index=length-1;
    while(s[index]==' ')
    {
        index--;
    }
    for(int i=index;i>=0;i--)
    {
        if(s[i]!=' ')
        {
            res++;
        }else
        {
            return res;
        }
    }
    return res;
}
求怕累！！！

