 int XXX(char * s){
    int hash1[128]={0};
    int hash2[128]={0};
    int left=0,right=0,sum=0;
    for(;right<strlen(s);right++)
    {
        int c = s[right];
        if(hash1[c])
        {
            left=max(hash2[c],left);
        }
        sum=max(sum,right-left+1);
        hash1[c]=1;
        hash2[c]=right+1;
    }
    
    return sum;
}
int max(int a,int b)
{
    if(a>b) return a;
    else return b;
}

