 int XXX(char * haystack, char * needle){
    if (strlen(needle) == 0) return 0;
    char *b = haystack;
    char *p, *r;
    for (; *haystack != '\0'; haystack ++) {
        for (p = haystack, r = needle; *p != '\0' && *r != '\0' && *p == *r; p ++, r ++);
        if (*r == '\0') return haystack - b;
    }

    return -1;
}

