 int XXX(char* s) {
    int a = 0;
    int b = 0;
    char *p = s;
    char *p1 = p;

    while (*p1 != '\0')
    {
        for (int i = 0; i < a; ++i) {
            if(*(p+i) == *p1){
                if(b < a)
                    b = a;
                a = 0;
                p++;
                p1 = p;
                i = 0;
            }
        }
        p1++;
        a++;
    }
    return b>a?b:a;
}

