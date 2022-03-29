 int XXX(char * haystack, char * needle){
    int count = 0, k = 0;
    int h_len = strlen(haystack), n_len = strlen(needle);

    if(n_len <= 0) return 0;

    while(count <= (h_len - n_len)) {
        while(k < n_len) {
            if(haystack[count + k] != needle[k]) {
                k = 0;
                break;
            }
            k++;
        }
        if(k != 0) {
            return count;
        }
        else {
            count++;
        }
    }
    return -1;
}

