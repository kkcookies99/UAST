 char * XXX(char ** strs, int strsSize){
    char *res;
    res = malloc(sizeof(char) * 201);
    res[0] = 0;
    int i = 0, j = 0;
    if (!strsSize) return res;
    while ((*strs)[i])
    {
        res[i] = (*strs)[i];
        i++;
    }
    res[i] = 0;
    for (int i = 1; i < strsSize; i++)
    {
        for (j = 0; res[j] != 0 && res[j] == strs[i][j]; j++) ;
        res[j] = 0;
    }
    return res;
}

