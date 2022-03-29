int XXX(char * s){
    int rest = 0;
    for(int i = 0;i < strlen(s);i++)
    {
        switch(s[i]){
        case 'I':
            if(s[i+1] == 'V'){
                rest += 4;
                i++;
            }
            else if(s[i+1] == 'X'){
                rest += 9;
                i++;
            }else{
                rest += 1;
            }
            break;
        case 'V':
            rest += 5;
            break;
        case 'X':
            if(s[i+1] == 'L'){
                rest += 40;
                i++;
            }
            else if(s[i+1] == 'C'){
                rest += 90;
                i++;
            }else{
            rest += 10;
            }
            break;
        case 'L':
            rest += 50;
            break;
        case 'C':
            if(s[i+1] == 'D'){
                rest += 400;
                i++;
            }
            else if(s[i+1] == 'M'){
                rest += 900;
                i++;
            }else{
            rest += 100;
            }
            break;
        case 'D':
            rest += 500;
            break;
        case 'M':
            rest += 1000;
            break;
        }
    }
    return rest;
}


