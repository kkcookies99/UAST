char * XXX(char * a, char * b){
    int lena = strlen(a);
    int lenb = strlen(b);
    int lenmax = (lena > lenb) ? lena : lenb;
    char* res = (char*)malloc(lenmax+2);
    int i = 0;
    int jw = 0;     //进位

    while(jw>0 || i<lenmax)
    {
        int x = (i < lena) ? a[lena-1-i] - '0' : 0;
        int y = (i < lenb) ? b[lenb-1-i] - '0' : 0;
        int s = x + y + jw;
        if(s > 1)
        {
            s = s - 2;
            jw = 1;
        }
        else
        {
            jw = 0;
        }
        res[i++] = s + '0';       
    }
    res[i] = '\0';
    //反转
    char temp;   
    for(int j = 0; j < i/2 ; j++)
    {
        temp = res[i-1-j];
        res[i-1-j] = res[j];
        res[j] = temp;
    }
    return res;
}

