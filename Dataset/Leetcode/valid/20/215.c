 bool XXX(char * s){
    char *stack = (char *)malloc(sizeof(char) * 10000);
    int stack_size = 0;    
    int index = 0;
    while(*(s+index)!='\0'){
        char c = *(s+index);
        if(c == '(' || c=='{' || c=='[' ){
            stack[stack_size++] = c;
        }else if(c == ')' || c=='}' || c==']'){
            if(stack_size > 0){
                if((c == ')' && stack[stack_size-1]!='(')||(c == '}' && stack[stack_size-1]!='{')||(c == ']' && stack[stack_size-1]!='[')){
                    return false;
                }else{
                    stack_size--;
                }
            }else{
                return false;
            }
        }
        index++;
    }
    if(stack_size>0){
        return false;
    }
    return true;
}



