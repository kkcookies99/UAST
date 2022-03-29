 bool XXX(char * s){
    char *stack=(char*)malloc(strlen(s)+1);
    stack[0]='0';
    int num=0;
    for(int i=0;i<strlen(s);i++){
        stack[num+1]=s[i];
        num=num+1;
        if((s[i]==')'&&stack[num-1]=='(')||(s[i]==']'&&stack[num-1]=='[')||(s[i]=='}'&&stack[num-1]=='{')){
            num=num-2;
        }
    }
    if(num==0){
        return true;
    }else{
        return false;
    }
}

