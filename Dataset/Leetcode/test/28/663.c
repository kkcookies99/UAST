 int XXX(char * haystack, char * needle){
        void get_next(const char *mode,int modeSize, int *next){
            int j =0;
            next[0] = 0;
            for(int i = 1; i < modeSize; i++){
                while(j > 0 && mode[i] != mode[j]){
                    j = next[j - 1];
                }
                if(mode[i] == mode[j]) j++;
                next[i] = j;
            }
        }
        int j =0;
        int n = strlen(needle);
        if(n == 0) return 0;
        int next[n];
        get_next(needle,n,next);
        for(int i = 0; haystack[i] != '\0'; i++){
            while(j > 0 && haystack[i] != needle[j]){
                j = next[j - 1];
            }
            if(haystack[i] == needle[j]) j++;
            if(j == n) return i - n + 1;
        }
        return -1;
}

