 int XXX(char * haystack, char * needle){
    if(!*needle) return 0;
    int hlen=strlen(haystack), nlen=strlen(needle);
    int i=0;
    for(int j=0; j+nlen<=hlen; j++){
        if(haystack[j] != *needle) continue;
        for(i=0; i<nlen; i++){
            if(haystack[j+i]!=needle[i]) break;
        }
        if(i==nlen) return j;
    }
    return -1;
}

