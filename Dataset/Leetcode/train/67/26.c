 char * XXX(char * a, char * b){
    int alen=strlen(a);
    int blen=strlen(b);
    int binary=0;
    int len;
    len=alen>blen?alen:blen;
    int anum,bnum,sum;
    char* s=(char*) malloc ((len+2) * sizeof(char));
    s[len+1]='\0';
    for(--alen,--blen;len>=0;alen--,blen--,len--){
        if(alen<0)
        anum=0;
        else
        anum=a[alen]-'0';
        if(blen<0)
        bnum=0;
        else
        bnum=b[blen]-'0';
        sum=anum+bnum+binary;
        binary=sum/2;
        s[len]='0'+sum%2;
    }
    if(s[0]=='0')
    return &s[1];
    else return &s[0];
}

