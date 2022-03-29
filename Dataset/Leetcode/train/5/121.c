 char * XXX(char * s){
    int len=strlen(s);
    int dp[1000][1000]={0};
    int max=0;
    int maxi=0;
    int maxj=0;
    for(int i=0;i<len-1;i++){
        dp[i][i]=1;
        if(s[i]==s[i+1])
            dp[i][i+1]=1;
    }
        
    for(int i=0;i<len;i++)
    {
        for(int j=len-1;j>i;j--)
        {
            dp[i][j]=dp[i+1][j-1]&&(s[i]==s[j]);
            if((j-i>max)&&dp[i][j]==1){
                maxi=i;
                maxj=j;
            }
        }
    }
    char s1[1001];
    int k=0;
    //printf("%d %d %d\n",maxi,maxj,k);
    for(int i=maxi;i<=maxj;i++)
        s1[k++]=s[i];
    //printf("%s\n",s1);
    return s1;
}

