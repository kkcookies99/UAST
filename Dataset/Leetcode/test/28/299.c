 int XXX(char * haystack, char * needle){
    int slen1 = strlen(haystack);
    int slen2 = strlen(needle);
    if(slen2 == 0)
    {
        return 0;
    }
    if(slen1 < slen2)
    {
        return -1;
    }
    int count = 0;
    int first = 0;
    int flag = 0;
    for(int i = 0, j = 0; i < slen1 && j < slen2;)
    {
        if(haystack[i] == needle[j])
        {
            if(flag == 0)
            {
                first = i;
            }
            count++;
            i++;
            j++;
            flag = 1;
        }
        else
        {
            if(flag == 1)
            {
                i = first + 1;
            }
            else
            {
                i++;
            }
            j = 0;
            count = 0;
            flag = 0;
        }
    }
    return (count == slen2) ? first : -1;
}

