 bool XXX(char * s){
    if (s == NULL || s[0] == '\0') return true;
    char *stack = (char*)malloc(strlen(s)+1); 
    int top =0;
    for (int i = 0; s[i]; i++) {
        if (s[i] == '(' || s[i] == '[' || s[i] == '{') stack[++top] = s[i];       
        else if((s[i] == (stack[top] + 1))||(s[i] == (stack[top] + 2))) top--;        
        else return false;
    }
    free(stack);
    return (!top);
}

