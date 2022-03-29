 int XXX(char * s){
    int len = 0;
    int i = 0;
    int j = 0;
    int tmp_j = 0;
    int num = 0;
    int count = 0;
    len = strlen(s);

    if (len == 0)
    {
        return 0;
    }

    if (len == 1)
    {
        return 1;
    }

    for (i=0; i<len; i++)
    {
        for (j=tmp_j; j<i; j++)
        {
            if (s[j] == s[i])
            {
                if (count < num)
                {
                    count = num;
                }
                num = i-j;
                tmp_j = j+1;
                break;
            }
        }

        if (j == i)
        {
            num++;
        }
    }

    if (num > count)
    {
        count = num;
    }

    return count;
}

