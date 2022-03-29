 int XXX(char * s){
    char *cur = s, *head = s;
    int max = 0;
    while (*cur) {
        for (char *p = head; p < cur; ++p)
            if (*p == *cur) {
                head = p + 1;
                break;
            }
        max = cur - head + 1 > max ? cur - head + 1 : max;
        ++cur;
    }
    return max;
}

