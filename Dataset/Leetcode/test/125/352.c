 bool XXX(char * s){
    char* newString = malloc(sizeof(char) * strlen(s));
    int k = 0;
    for(int i = 0; i < strlen(s); i++){
        if(isalnum(s[i])){
            newString[k++] = s[i];
        }
    }
    
    int i = 0, j = strlen(s) - 1;
    while(i < j){
        if(tolower(newString[i]) != tolower(newString[j])){
            return false;
            break;
        }else{
            i++;
            j--;
        }
    }
    return true;
}

