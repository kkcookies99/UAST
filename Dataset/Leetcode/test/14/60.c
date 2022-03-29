 char * XXX(char ** strs, int strsSize){

    if (strsSize == 0) return "";
    if (strsSize==1)  return strs[0]; 
    if (strlen(strs[0]) == 0) return "";

    char *r = (char *)malloc(sizeof(char)*201);
    //char r[201] = {};
    for ( int i = 0; i < strlen(strs[0]); ++i)
    {
        int j = 1;
        for (; j < strsSize; ++j)
        {
            if (strs[j][i] != strs[0][i])
            {
                break;
            }
        }

        if (j == strsSize)
        {
            r[i] = strs[0][i];
            r[i+1] = '\0';
        }
        else
        {
            r[i] = '\0';
            break;
        }
    }

    return r;
}

