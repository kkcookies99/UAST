 char * XXX(char * s){  
    if(*s==0) return NULL;
	char *p,*max_str;
    int c=1,prev=1;
	bool find = false;
    while(*s!='\0'){
        p=s+1;
        while(*p!='\0'){
            if(*s==*p&&prev<c){
            	prev = c;
                find = true;
            }
            c++;
            p++;
        }
        if(find){
            max_str = s;
            find = false;
        }
        c=1;
        s++;
    }
    char res[1000];
    strncpy(res,max_str,prev+1);
    return res;
}

