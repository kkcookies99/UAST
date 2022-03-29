 bool XXX(char * s){
    int n = strlen(s);
    if (n % 2 == 1) return false;
    int stk[n+1], top = 0;
    int i;
    for (i=0; i<n; ++i){
        if (s[i]=='('||s[i]=='['||s[i]=='{')
            stk[++top] = s[i];
        else if (s[i] == ')'){
            if (top == 0) return false;
            if (stk[top--] != '(') return false; 
        }
        else if (s[i] == ']'){
            if (top == 0) return false;
            if (stk[top--] != '[') return false;  
        }
        else if (s[i] == '}'){
            if (top == 0) return false;
            if (stk[top--] != '{') return false; 
        }
    }
    return top==0;
}

