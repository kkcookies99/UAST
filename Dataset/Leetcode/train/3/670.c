 int XXX(char * s){
    int max_len = 0;
    char *t = s;

    while (*s != '\0')
    {
        int i;
        for (i = 0; s != t+i; i++)
        {
            if (*s == *(t+i))
            {
                t += i + 1;
                break;
            }
        }
        if (i+1 > max_len)
            max_len = i+1;
        s++;
    }

    return max_len;
}

