 int XXX(char * s){
    int lastIdex = strlen(s) -1;
    int len = 0;
    for (int i = (strlen(s) - 1); i>= 0; i--){
        if (s[i] == ' '){
            lastIdex--;
        } else {
            break;
        }
    }
    for (int i = lastIdex; i >= 0; i--){
        if (s[i] != ' '){
            len++;
        } else {
            return len;
        }
    }
    return (lastIdex + 1);
}

