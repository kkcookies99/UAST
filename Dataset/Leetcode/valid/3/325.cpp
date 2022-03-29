 int XXX(string s) {
    dict ptr[26];
    int j=0;
    int max_str=0,temp=0;
    int len=s.length();
    while(len--){

    if(ptr[s[j]-'a'].val==1){
        ptr[s[j]-'a'].val=0;
		max_str=j-ptr[s[j]-'a'].loc;

    } 
    else max_str++;	
    ptr[s[j]-'a'].val++;
    ptr[s[j]-'a'].loc=j;

    temp=max(temp,max_str);

    j++;
}

