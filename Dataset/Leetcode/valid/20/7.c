 bool XXX(char * s){
    char k[10000];    //定义一个长度为10000的数组,相当于站容器
    int i=0,j=0;
    if(s[0]==']'||s[0]==']'||s[0]=='}')
    return false;
    while(s[i]!='\0')
    {
        char ch=s[i];
        if(ch=='('||ch=='{'||ch=='[')
        {
            k[j++]=ch;
        }
        else
        {
            if(k[j-1]==ch)
            j--;
        }
        i++;
    }
    return true;
}

