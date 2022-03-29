int XXX(char * s){
    
    int len,res=0;
    len=strlen(s);
    
    for(int i=0; i<len; ++i){
        if(s[i]=='I') {
            if(s[i+1]=='V') res+=4,i++;
            else if(s[i+1]=='X') res+=9,i++;
            else res+=1;
            continue;
        }
        if(s[i]=='X') {
            if(s[i+1]=='L') res+=40,i++;
            else if(s[i+1]=='C') res+=90,i++;
            else res+=10;
            continue;
        } 
        if(s[i]=='C') {
            if(s[i+1]=='D') res+=400,i++;
            else if(s[i+1]=='M') res+=900,i++;
            else res+=100;
            continue;
        }
        if(s[i]=='V') res+=5;
        if(s[i]=='L') res+=50;
        if(s[i]=='D') res+=500;
        if(s[i]=='M') res+=1000;
    }

    return res;
}

