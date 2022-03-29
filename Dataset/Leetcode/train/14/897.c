 char * XXX(char ** strs, int strsSize){
    if(strsSize == 0)
    {
        return NULL;
    }
    int i = 0;
    int j = 0;
    int str_count = 0;
    int len = strlen(strs[0]);
    char *result = (char *)calloc(201,sizeof(char));
    for(i = 0;i < len;i++)
    {
        for(j = 0;j < strsSize;j++)
        {
            if(strs[j][i] == strs[0][i])
            {
                continue;
            }
            else
            {
                goto END;
            }
        }
        result[str_count++] = strs[0][i];
    }
END:
    return result;
}

