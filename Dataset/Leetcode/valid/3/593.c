 int XXX(char * s){
    int len = strlen(s);
    int star = 0;
    int end = 0;
    int max = 1;
    int max2 = 0;
    int mid = 0;
    if (len == 0)
    {
        max2 = 0;
    }
    else if(len == 1)
    {
        max2 = 1;
    }
    else{
        for (end = 0; end <= len - 1; end++)
        {
            mid = end-1;
            max = 1;
            while (mid >= star)
            {
                if (s[mid] != s[end])
                {
                    max++;
                    mid--;
                }
                else {
                    star = star+1;
                }
                if (max2 < max) {
                    max2 = max;
                }
            }
        }
    }
    return max2;
}

