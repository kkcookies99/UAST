 int XXX(char * s){
    char occupied[256] = {0};
    int p1 = 0, p2 = 0;
    int max_len = 0;
    int str_len = strlen(s);

    while(p1 < str_len && p2 < str_len)
    {
        max_len = max_len > (p2 - p1) ? max_len : (p2 - p1);
        while(0 != occupied[s[p2]])
        {
            occupied[s[p1]] = 0;
            p1++;
        }
        occupied[s[p2]] = 1;
        p2++;   
    }
    max_len = max_len > (p2 - p1) ? max_len : (p2 - p1);
    return max_len;
}

