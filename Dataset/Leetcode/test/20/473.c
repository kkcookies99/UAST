 bool XXX(char * s){
    int slen = strlen(s);
    char* stk = (char*)malloc(sizeof(char) * slen);
    int top = -1;
    for(int i = 0; i < slen; i++)
    {
        if(s[i] == '(' || s[i] == '[' || s[i] == '{')
        {
            stk[++top] = s[i];
        }
        else if((top > -1) && ((s[i] == ')' && stk[top] == '(') || (s[i] == ']' && stk[top] == '[') || (s[i] == '}' && stk[top] == '{')))
        {
            top--;
        }
        else
        {
            return false;
        }
    }
    return (top == -1) ? true : false;
}

