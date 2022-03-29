 char * XXX(char * s, int numRows){
    if(numRows<=1)
        return s;
    int n = strlen(s);
    if(n<=1)
        return s;
    int p[n];
    int yu;
    for(int i=0;i<n;i++)
    {
        yu = i%(2*numRows-2);
        if(yu<numRows)
            p[i]=yu;
        else
            p[i]=numRows*2-yu-2;
    }
    char*q=(char*)malloc(n*sizeof(char));
    int x=0;
    for(int a=0;a<numRows;a++)
    for(int j=0;j<n;j++)
    {
        if(p[j]==a)
            q[x++]=s[j];
    }
    return q;
}

