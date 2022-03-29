bool XXX(int x){
    if (x < 0) return false;
    char *s = (char*)malloc(sizeof(char) * 15);

    int index = 0;
    while (x) {
        s[index++] = x % 10;
        x /= 10;
    }
    s[index] = '\0';
    
    int i = 0;
    int j = index - 1;
    while (i < j) {
        if (s[i] == s[j]) {
            i++;
            j--;
        } else {
            return false;
        }
    }
    return true;
}


