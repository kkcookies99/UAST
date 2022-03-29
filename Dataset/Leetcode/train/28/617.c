 int XXX(char * haystack, char * needle){
    if(*needle == '\0') return 0;
    int hl, nl, j; 
    hl = strlen(haystack); nl = strlen(needle);
    if(nl > hl) return -1;
    for(int i=0; i<hl; i++){
        if(haystack[i] == needle[0]){
            for(j=0; j<nl; j++){
                if(i+j == hl || haystack[i+j] != needle[j]) break;
            }
            if(j == nl) return i;
        }
    }
    return -1;
}

