 int XXX(char * haystack, char * needle){
    int l1 = strlen(haystack);
    int l2 = strlen(needle);
   if(l1<l2)
    return -1;
   if(!l2) 
    return 0;
    for(int i=0;i<l1;i++){
        if(haystack[i]==needle[0]){
            if(strncmp(needle,haystack+i,l2)==0){
                return i;
            }
        }
    }
    return -1;
}

