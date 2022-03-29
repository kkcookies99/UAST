 bool XXX(char * s){
    int len = strlen(s);
    if (len % 2 != 0 || len == 0) {
        return false;
    }
    char *stack = (char*)malloc(sizeof(char) * (len + 1)); 
    char *top = stack;
    char ch;
    while (*s) {
        switch (*s) {
            case '{' :
            case '[' :
            case '(' :
                *top++ = *s++;
                break;
            case '}' :
                if (top == stack) {
                    return false;
                }
                ch = *--top;
                s++;
                if (ch != '{') {
                    return false;
                }
                break;
            case ']' :
                 if (top == stack) {
                    return false;
                }
                ch = *--top;
                s++;
                if (ch != '[') {
                    return false;
                }
                break;
           case ')' :
                if (top == stack) {
                    return false;
                }
                ch = *--top;
                s++;
                if (ch != '(') {
                    return false;
                }
                break;
            default :
                if (top == stack && *(s + 1) != '\0') {
                    return false;
                }
        } 
    }
    if (top != stack) {
        return false;
    }
    free(stack);
    return true;
}


