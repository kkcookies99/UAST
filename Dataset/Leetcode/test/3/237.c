 int count1(bool *a){
    int sum=0;
    for(int i=0;i<26;i++){
        if(a[i]){
            sum++;
        }
    }
    return sum;
}
int XXX(char* s) {
    const int len=strlen(s);
    bool alpha[26];
    int max=0;
    memset(alpha,false,sizeof(alpha));
    for(int i=0;i<len;i++){
        int pos=s[i]-97;
        if(alpha[pos]){
            memset(alpha,false,sizeof(alpha));
        }
         alpha[pos]=true;
        int tmp=count1(alpha);
        max=tmp>max?tmp:max;
    }
    return max;
}

