 int XXX(char * haystack, char * needle){
    int m = strlen(haystack);
    int n = strlen(needle);
    if(n==0) return 0;
    if(m==0) return -1;
    int* b = (int*) malloc((n+1)*sizeof(int)); 
    b[0]=-1;
    int j=-1,i=0;
    while(i<n){
        while(j>=0 && needle[i] != needle[j])j=b[j];
        i++,j++;
        b[i]=j;
    }
    i=0,j=0;
    while(i<m){
        while(j>=0 && haystack[i]!=needle[j])j=b[j];
        i++,j++;
        if(j==n){
            return i-strlen(needle);
        }
    }
    return -1;
}


