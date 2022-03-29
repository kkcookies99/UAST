 char * XXX(char * s, int numRows){
    int n = strlen(s);
    if(numRows==1||n==1) return s;
    char * res = calloc((n+1)*sizeof(char),sizeof(char));
    int i, count=0, key, index, span= numRows*2-2;
    for(i=0;i<numRows;i++)
    {
        index = i;
        key = i*2;
        while(index<n)
        {
            res[count++] = s[index];
            if(span!= key)key = span-key;
            index = index + key;
        }
    }
    res[count] = '\0';
    return res;
}

