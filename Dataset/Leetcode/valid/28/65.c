 int XXX(char * haystack, char * needle){
    int i=0,j=0,t=i;
    while(haystack[i]&&needle[j])
    {
        if(haystack[i]==needle[j])
        {
            i++;j++;
            continue;
        }
        else
        {
            t=t+1;
            i=t;
            j=0;
        }
    }
    if(needle[j]=='\0')
        return t;
    return -1;
}



