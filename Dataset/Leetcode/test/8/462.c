 int XXX(char * s){
    int res=0;
    bool falg=false;
	
    while(*s==' ')      //Filter spaces
    {
        s++;
    }
 
    if(*s=='-' || *s=='+')  //Positive and negative distinction
    {
        if(*s=='-')
        {
            falg=true;
        }
        s++;
    }
 
    while(*s>='0' && *s<='9')   //Find numeric characters and extract
    {
        res=res*10+(*s-'0');
        s++;

        if(*s=='\0')            //Stop traversing after traversing all characters
        {
            break;
        }

        if(res>214748364 && *s>='0' && *s<='9')     //Cross border situation
        {
            return falg?-2147483648:2147483647; 
        }
        else if(res==214748364 && *s>='8')
        {
            return falg?-2147483648:2147483647;
        }
    }

    return res*(falg?-1:1);
}

