 int XXX(char * s){
    int len=strlen(s);
    int n=-1;
    for(int i=len-1;i>=0;i--){
        if(s[i]!=' '){
            for(int j=i-1;j>=0;j--){
                if(s[j]==' '){
                    n=j;
                    break;
                }
            }
            return i-n;
        }
    }
    return len;
}

