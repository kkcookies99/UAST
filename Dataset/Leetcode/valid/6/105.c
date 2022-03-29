 char * XXX(char * s, int numRows){
    if (numRows == 1) return s;
    int size = strlen(s);
    int space = numRows * 2 - 2;
    int times = numRows - 2;
    char* new_s = (char*)malloc(sizeof(char) * (size + 1));
    strcpy(new_s, s);
    int i = 0, x = 0;
    while (x < size)
    {
        new_s[i] = s[x];
        i++;09
        x += space;
    }
    int run = 1;
    while (run <= times)
    {
        int y1 = run, y2 = space - run;
        while (y1 < size || y2 < size)
        {
            if (y1 < size)
            {
                new_s[i] = s[y1];
                i++;
                y1 += space;
            }
            if (y2 < size)
            {
                new_s[i] = s[y2];
                i++;
                y2 += space;
            }
        }
        run++;
    }
    int z = numRows - 1;
    while (z < size)
    {
        new_s[i] = s[z];
        i++;
        z += space;
    }
    return new_s;
}

