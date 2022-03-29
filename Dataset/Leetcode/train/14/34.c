 char * XXX(char ** strs, int strsSize){
    char *a;
    char tmp;
    int i;
    int count = 0;
    if (strsSize == 0)
        return "\0";
    while (1)
    {
        tmp = *(strs[0] + count);
        if (tmp == '\0')
        {
            *(strs[0] + count) = '\0';
            return strs[0];
        }
        for (i = 1; i < strsSize; i++)
        {
            a = strs[i];
            if (*(a + count) == '\0' || *(a + count) != tmp)
            {
                *(strs[0] + count) = '\0';
                return strs[0];
            }
        }
        count++;
    }
}

