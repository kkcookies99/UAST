 int XXX(char * s){
    int size = strlen(s);
    int count = 0;

    for (int i = size-1; i >= 0; i--) {
        if (s[i] == ' ' && count != 0) {
            break;
        }
        if (s[i] == ' ' && count == 0) {
            continue;
        }
        count ++;
    }

    return count;
}


