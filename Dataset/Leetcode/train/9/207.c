bool XXX(int x){
    char str[100] = {0};
    int str_len = 0;
    int i = 0;
    
    if(x<0)
        return false;
    
    do{
        str[i] = (x%10) + '0';
        i++;
        x = x/10;
    }while(x);
    
    str_len = strlen(str);
    for(i = 0; i < str_len/2; i++){
        if(str[i] == str[str_len-(i+1)])
           continue;
         else
            return false;
         
    }
    return true;
        
}


